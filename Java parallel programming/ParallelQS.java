import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ParallelQS {
    private long duration;
    private final ExecutorService threadPool;
    private final int numberofThreads;
    // AtomicInteger 保护数据的原子性
    private final AtomicInteger count;

    public ParallelQS() {
        this.numberofThreads = 1;
        this.threadPool = Executors.newFixedThreadPool(this.numberofThreads);
        this.count = new AtomicInteger();
    }

    public ParallelQS(int numberofThreads) {
        this.numberofThreads = numberofThreads;
        threadPool = Executors.newFixedThreadPool(this.numberofThreads);
        count = new AtomicInteger();
    }

    public long getLastDuration() {
        return this.duration;
    }

    public int getThreadCount() {
        return this.numberofThreads;
    }

    public void sort(int[] data) {
        long start = System.currentTimeMillis();
        threadPool.submit(new Sorter(data, 0, data.length-1));
        do {
            try {
                synchronized (count) {
                    count.wait();
                }
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        } while ( count.get()>0 );
        threadPool.shutdown();
        while (!threadPool.isTerminated());
        duration = System.currentTimeMillis() - start;
    }

    private class Sorter implements Runnable {

        private final int data[];
        private final int left;
        private final int right;

        Sorter(int[] data, int left, int right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public void run() {
            sort(data, left, right);
        }

        private void sort(int[] data, int left, int right) {
            if (left < right) {
                int pivot = partition(data, left, right);
                Sorter lSorter = new Sorter(data, left, pivot-1);
                Sorter rSorter = new Sorter(data, pivot+1, right);
                threadPool.submit(lSorter);
                threadPool.submit(rSorter);
            }
        }

        private int partition(int[] data, int left, int right) {
            int center = (left + right) / 2;
            if (data[left] > data[center])
                swap(data, left, center);
            if (data[left] > data[right]) {
                swap(data, left, right);
            }
            if (data[center] > data[right]) {
                swap(data, center, right);
            }
            return center;
        }

        private void swap(int[] data, int left, int right) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
        }
    }
}

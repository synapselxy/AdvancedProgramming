

public class ProducerComsumer {
    // final keyword 基本数据类型的变量一旦在初始化之后便不能更改其值；引用类型的变量在对其初始化之后不能再让其指向另一个对象。
    private static final int capacity = 5; 

    // private static final Lock lock = new ReentrantLock();

    public static void main(String args[]) {
        // Queue<Integer> queue = new LinkedList<Integer>();
        BufferArea bufferArea = new BufferArea(0, capacity);

        Producer procedure1 = new Producer( bufferArea);
        Producer procedure2 = new Producer( bufferArea);
        Producer procedure3 = new Producer( bufferArea);

        Consumer consumer1 = new Consumer( bufferArea);
        Consumer consumer2 = new Consumer( bufferArea);

        Thread t1 = new Thread(procedure1, "P1");
        Thread t2 = new Thread(procedure2, "P2");
        Thread t3 = new Thread(procedure3, "P3");
        Thread t4 = new Thread(consumer1, "C1");
        Thread t5 = new Thread(consumer2, "C1");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class Parellel_Quicksort {
    @SuppressWarnings("FieldCanBeLocal");
    private static int NUMBER_OF_ELEMENTS = 50000000;

    public static void main(String args[]) {
        
        int[] data = new int[NUMBER_OF_ELEMENTS];

        for (int i = 0; i < data.length; ++i) {
            data[i] = (int)( Math.random() * Integer.MAX_VALUE );
        }

        ParallelQS qs = new ParallelQS(16);
        qs.sort(data);

        System.out.printf("Sorted %d elements with %d threads in %d ms.%n", data.length, qs.getThreadCount(), qs.getLastDuration());
    }
}



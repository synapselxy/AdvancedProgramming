public class BufferArea {
    private int currNum ;
    private int capacity ;

    public BufferArea(int currentNumber , int capacity) {
        this.currNum = currentNumber;
        this.capacity = capacity;
    }

    public synchronized void set() {
        if(currNum<capacity) {
            ++currNum;
            System.out.println(Thread.currentThread().getName()+" produce a product! Current product number is "+currNum);
            notify();
        }else {
            try {
                System.out.println(Thread.currentThread().getName()+" WAIT! BufferArea is FULL! Current product number is "+currNum);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                // TODO: handle exception
            }
            
        }
    }

    public synchronized void get() {
        if(currNum>0) {
            --currNum;
            System.out.println(Thread.currentThread().getName()+" consume a product! Current product number is "+currNum);
            // only wake one thread, this won't cause deadlock (try to imagine two situations that awake the same kind of threads but that 
            // won't cause deadlock )
            notify();
        }else {
            try {
                System.out.println(Thread.currentThread().getName()+" WAIT! BufferArea is EMPTY! Current product number is "+currNum);
                // Thread wait
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                // TODO: handle exception
            }
            
        }
    }
}
// 消费者
public class Consumer implements Runnable {
    private BufferArea ba;

    public Consumer(BufferArea ba) {
        this.ba = ba;
    }

    @Override
    public void run() {
        // while loop guarantee threads running hopefully
        while (true) {
            setIntervalTime();
        ba.get();
        }
    }
    
    public void setIntervalTime() {
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
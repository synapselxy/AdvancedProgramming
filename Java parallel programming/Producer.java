// 生产者
public class Producer implements Runnable {
    private BufferArea ba;

    public Producer( BufferArea ba) {
        this.ba = ba;
    }
    
    @Override
    public void run() {
        while (true) {
            setIntervalTime();
            ba.set();
        }
    }

    public void setIntervalTime() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
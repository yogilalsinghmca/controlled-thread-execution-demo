package threethreadcontroller;

public class Scanner extends Thread {

    private Object lock;

    public Scanner(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                try {
                    System.out.println("Scanning...");
                    Thread.sleep(1000);
                    lock.notify();
                    lock.wait();


                } catch (InterruptedException e) {

                }
            }
        }
    }
}

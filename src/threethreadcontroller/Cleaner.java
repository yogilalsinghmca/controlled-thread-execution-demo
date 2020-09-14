package threethreadcontroller;

public class Cleaner extends Thread {
    private Object lock;

    public Cleaner(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {

                    System.out.println("Cleaning...");
                    Thread.sleep(1000);
                    lock.notify();
                    lock.wait();

                } catch (InterruptedException e) {

                }


            }

        }
    }
}

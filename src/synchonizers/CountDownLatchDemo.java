package synchonizers;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        new MyThread(latch, "Thread A", 1000);
        new MyThread(latch, "Thread B", 2000);
        new MyThread(latch, "Thread C", 3000);

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}

class MyThread implements Runnable {
    private CountDownLatch latch;
    private int timeout;

    public MyThread(CountDownLatch latch, String threadName, int timeout) {
        this.latch = latch;
        new Thread(this, threadName).start();
        this.timeout = timeout;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " counting down");
        latch.countDown();
    }
}

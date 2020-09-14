package synchonizers;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo2 extends Thread {
    private static Semaphore seema = new Semaphore(3);

    public static void main(String[] args) {
        SemaphoreDemo2 task = new SemaphoreDemo2();
        for (int i = 0; i < 30; i++) {
            new Worker(task).start();
        }
    }

    public void restrictedMethod() throws InterruptedException {
        System.out.println("aquirring lock");
        seema.acquire();
        System.out.println("doing my task after lock");
        Thread.sleep(10000);
        seema.release();

    }
}

class Worker extends Thread {

    private SemaphoreDemo2 task;

    Worker(SemaphoreDemo2 task) {
        this.task = task;
    }

    public void run() {
        try {
            System.out.println("method executed by " + Thread.currentThread().getName());
            task.restrictedMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
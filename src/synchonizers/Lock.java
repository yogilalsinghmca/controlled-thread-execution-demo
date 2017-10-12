package synchonizers;

import java.util.concurrent.LinkedBlockingQueue;

public class Lock {

    private int keys;

    private LinkedBlockingQueue<Integer> q;

    public Lock(int keys) throws InterruptedException {
        q = new LinkedBlockingQueue<Integer>();
        while (q.size() != keys)
            q.put(0);
    }

    public void getKey() throws InterruptedException {
        q.take();
    }

    public void returnKey() throws InterruptedException {
        q.put(0);
    }

    static Lock lck;
    public static void main (String [] args) throws InterruptedException {

        lck = new Lock(3);
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    lck.getKey();
                    Lock.test();
                    lck.returnKey();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        for (int t = 0; t < 20; t ++) 
            new Thread(r).start();
    }

    public static void test() throws InterruptedException {
        System.out.println("I am " + Thread.currentThread().getName());
        Thread.sleep(1000);
        System.out.println();
    }
}


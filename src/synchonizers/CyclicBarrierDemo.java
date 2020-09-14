package synchonizers;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, new BarrierAction());

        System.out.println("Starting");


    }

}

class CyclicBarrierThread implements Runnable {

    private CyclicBarrier barrier;

    public CyclicBarrierThread() {
    }

    @Override
    public void run() {

    }

}

class BarrierAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Barrier action executed.");
    }
}

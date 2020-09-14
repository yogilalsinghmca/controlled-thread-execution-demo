package pool;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<E> implements CustomQueue<E> {

    private Queue<E> queue = new LinkedList<E>();

    @Override
    public synchronized void pus(E e) {
        queue.add(e);
        //wake up anyone waiting on queue to put some item
        notifyAll();
    }

    @Override
    public synchronized E pop() {
        E e = null;
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e1) {
                return e;
            }
        }
        return queue.remove();
    }
}

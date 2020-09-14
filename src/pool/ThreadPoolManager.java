package pool;

public class ThreadPoolManager {

    private final int THREADPOOL_CAPACITY;
    private MyQueue<Runnable> queue = new MyQueue<Runnable>();

    public ThreadPoolManager(int capacity) {
        this.THREADPOOL_CAPACITY = capacity;
        initAllWorkerThreads();
    }

    private void initAllWorkerThreads() {
        for (Integer i = 0; i < THREADPOOL_CAPACITY; i++) {
            Thread t = new Thread(new Worker(queue, i.toString()));
            t.start();
        }
    }

    public void submitTask(Runnable task) {
        queue.pus(task);
    }
}

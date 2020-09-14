package pool;

public class Worker implements Runnable {

    private MyQueue<Runnable> queue;
    private String name;

    public Worker(MyQueue<Runnable> queue, String name) {
        this.queue = queue;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            Runnable r = queue.pop();
            System.out.println("Taken Item by thread name:" + this.name);
            r.run();
            System.out.println("Task completed of thread " + this.name);
        }

    }

}

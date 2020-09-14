package producerConsumerProblem;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestProducerConsumer {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
        Consumer consumer = new Consumer(queue);
        Producer producer = new Producer(queue);
        Thread t1 = new Thread(consumer, "consumer");
        Thread t2 = new Thread(producer, "producer");
        t1.start();
        t2.start();
    }

}

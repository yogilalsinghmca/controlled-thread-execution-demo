package producerConsumerProblem;

import java.util.Queue;

public class Consumer implements Runnable{
	Queue<Integer> queue;

	public Consumer(Queue<Integer> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		while(true){
			Integer i = queue.poll();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("processed task" + i);
		}
	}

}

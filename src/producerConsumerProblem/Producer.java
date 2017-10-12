package producerConsumerProblem;

import java.util.Queue;

public class Producer implements Runnable{
	Queue<Integer> queue;
	Integer i = 0;

	public Producer(Queue<Integer> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {		
		while(true){
			queue.add(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
			}
			System.out.println("submitted task" + i);
			i++;
		}
	}

}

package synchonizers;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

	public static void main(String[] args) {
		Q q = new Q();
		
		new Producer(q, "Producer");
		new Consumer(q, "Consumer");
	}

}

class Q {
	private int i;

	private Semaphore getter = new Semaphore(0);
	private Semaphore putter = new Semaphore(1);

	public void get() {
		try {
			getter.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Consumed: " + i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		putter.release();
	}

	public void put(int n) {
		try {
			putter.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.i = n;
		System.out.println("Produced: " + n);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		getter.release();
	}
}

class Producer implements Runnable {

	private Q q;

	public Producer(Q q, String threadName) {
		this.q = q;
		new Thread(this, threadName).start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			q.put(i + 1);
		}

	}
}

class Consumer implements Runnable {

	private Q q;

	public Consumer(Q q, String threadName) {
		this.q = q;
		new Thread(this, threadName).start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			q.get();
		}
	}
}

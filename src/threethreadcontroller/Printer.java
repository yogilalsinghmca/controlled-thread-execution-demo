package threethreadcontroller;
public class Printer extends Thread{
	private Object lock;
	public Printer(Object lock) {
		this.lock=lock;
	}
	@Override
	public void run(){		
			while(true){
				synchronized(lock){
				try {					
					System.out.println("Printing...");
					lock.notify();
					lock.wait();				
					
				} catch (InterruptedException e) {				

				}
			}
		}
	}
}

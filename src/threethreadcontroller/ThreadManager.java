package threethreadcontroller;
public class ThreadManager extends Thread{
	private Object lock1= new Object();
	private Object lock2= new Object();
	private Object lock3= new Object();
	Scanner scanner=new Scanner(lock1);
	Printer pritner= new Printer(lock2);
	Cleaner cleaner= new Cleaner(lock3);
	Thread t1= new Thread(scanner);
	Thread t2= new Thread(pritner);
	Thread t3= new Thread(cleaner);


	@Override
	public void run(){
		synchronized(lock1){
			synchronized(lock2){
				synchronized(lock3){
					t1.start();
					t2.start();
					t3.start();
					while(true){
						try {							
							lock1.notify();
							lock1.wait();

							lock2.notify();
							lock2.wait();

							lock3.notify();
							lock3.wait();
						} catch (InterruptedException e) {

						}	
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		new ThreadManager().start();
	}
}

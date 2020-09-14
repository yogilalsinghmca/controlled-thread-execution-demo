package pool;

public class ThreadManagerDemo {

    public static void main(String[] args) {
        ThreadPoolManager manager = new ThreadPoolManager(2);
        System.out.println("Yogi");
        //now lets submit task
		/*for(int i = 0; i<10; i++){
			manager.submitTask(new Runnable() {
	            @Override
	            public void run() {
	                System.out.println("Starting Task ....A");
	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                System.out.println("Task A Completed....");
	            }
	        });*/

        //}
        manager.submitTask(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting Task B....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task B Completed....");
            }
        });

        manager.submitTask(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting Task C....");
	               /* try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }*/
                System.out.println("Task C Completed....");
            }
        });
        manager.submitTask(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting Task D....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task D Completed....");
            }
        });
        manager.submitTask(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting Task E....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task E Completed....");
            }
        });
        manager.submitTask(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting Task F....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task F Completed....");
            }
        });
        manager.submitTask(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting Task G....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task G Completed....");
            }
        });


    }

}

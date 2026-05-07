package multithreading;

public class Om extends Thread{
	    private int x;

	    Om(int x) {
	        this.x = x;
	    }

	    public void run() {
	        System.out.println("Run start");

	        for (int i = 1; i <= 2; i++) {
	            System.out.println("Run : " + i);
	        }

	        System.out.println("Run end");
	    }

	    public static void main(String[] args) 
			throws InterruptedException {

	        System.out.println("Main start");

	        Om p1 = new Om(2);
	        p1.start();

	        for (int i = 1; i <= 4; i++) {

	            System.out.println("Main : " + i);

	            if (i == 2) {
	                Thread.sleep(5000); 
	            }
	        }

	        p1.run(); 

	        System.out.println("Main end");
	    }
	}

package multithreading;

 public class ParallelExample{
	 public static void main(String[] args) {
	        MyThread1 t1 = new MyThread1();
	        MyThread2 t2 = new MyThread2();

	        t1.start();
	        t2.start(); // दोनों साथ शुरू
	    }
	}

	class MyThread2 extends Thread {
	    public void run() {
	        System.out.println("Breakfast making started");
	    }
	}// ParallelExample

 class MyThread1 extends Thread {
	 
	   	}




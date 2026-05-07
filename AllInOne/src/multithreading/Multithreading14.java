package multithreading;

public class Multithreading14{		 
		 	public static void main(String[] args) {
		 		System.out.println("main start");
		 		
		 		MyThread13 mt1 = new MyThread13();
		 		mt1.start(); //Thread-0 is ready-to-run
		 		
		 		System.out.println("main run");
		 	}
		 }

		 class MyThread13 extends Thread {
		 	
		 	@Override
		 	public void run() {
		 		String name = Thread.currentThread().getName();
		 		System.out.println(name + " run start");
		 		
		 		MyThread13 mt2 = new MyThread13();
		 		//mt2.start();//Thread-1(++) is ready-to-run
		 		mt2.run();
		 		
		 		System.out.println(name + " run end"); 
		 	}	 
		 
	}



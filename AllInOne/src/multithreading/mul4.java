package multithreading;

public class mul4  extends Thread {

	/**
	- Pausing Currently Running Thread (CRT) by using yield() method

	*/
	public static void main(String[] args) {
		System.out.println("main start");
		
		mul4 mt1 = new mul4();
		mt1.start();

		Thread.yield(); //Requesting Thread Scheduler to pause this CRT main thread 
						//and allowing other thread to execute
						//This request many be accepted or ignored by thread scheduler
		
		System.out.println("main end");
	}
}



		

	class Test31_yield {
		@Override
		public void run() {
			System.out.println("run is executed");
		}
	}
	
		
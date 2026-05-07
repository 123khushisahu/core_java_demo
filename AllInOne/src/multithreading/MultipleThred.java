package multithreading;
/*
 * Develop a program to print state names of a custom thread
 */

public class MultipleThred {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		
		Test21_getState mt1 = new Test21_getState();
		System.out.println("In main #1: " + mt1.getState());  //getState()is a one method
		
		mt1.start();
		System.out.println("In main #2: " + mt1.getState());
		
		Thread.sleep(2000);
		System.out.println("In main #4: "+ mt1.getState());
		
		Thread.sleep(7000);
		System.out.println("In main #4: "+ mt1.getState());

		System.out.println("main end");
	}


}


		
		
			
			
		class Test21_getState extends Thread {
			@Override
			public void run() {
				System.out.println("run start");
				System.out.println("In run  #3: "+ this.getState());
				
				try {
					Thread.sleep(5000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("run end");
			}
		}

			
			


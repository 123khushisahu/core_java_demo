package multithreading;


/**
 * 
 * Q12) Can we override start() method?
 *  	yes, no CE, no RE
 *      because it is not a final method
 *      
 * Q13) If override start() method, do we have any other problem?     
 *      - yes, custom thread is not started
 *      - run() method is not executed
 *        
 * Q14) Then, What is the need of overriding start() method?
 * 		- for executing some logic compulsory before every thread start
 * 		  we must place this logic in start() method by overriding it        
 * 	
 * Q15) What is the right design for overriding start() method?
 * 		1. first we must place our logic inside overriding start() method 
 * 		2. then at the end of overriding start() method body 
 *         we must place super.start()   
 * 
 */
class MyThread10 extends Thread {  // this is a custom class i cann't say any thread is there
	//i can say only here is a custom class
	@Override
	public void start() {
		System.out.println("start() start");
		
		System.out.println("start() end");
		//super.start();
	}
	
	
	@Override
	public void run() {
		String name = getName();
		System.out.println(name + " run start");
		System.out.println(name + " run end");
	}
}

public class Test18overriding  {
	public static void main(String[] args) {    //here i can say 1 main thread is there
		System.out.println("main start");
		
		MyThread10 mt1 = new MyThread10();
		mt1.start();					//2nd thread
		
		MyThread10 mt2 = new MyThread10();
		mt2.start();			//3rd thread
		
		System.out.println("main end");
	}
}
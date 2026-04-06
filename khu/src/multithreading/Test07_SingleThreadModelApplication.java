package multithreading;

public class Test07_SingleThreadModelApplication {

	public static void main(String[] args) {
		
		Ac t1 = new Ac();
		t1.start();//non static
		System.out.println("main start");
		
		System.out.println("main end");
		String currentThreadName = Thread.currentThread().getName();
        System.out.println("The current running thread name is: " + currentThreadName);
	}

}

class Ac extends Thread {
	
	public void run() {
		String currentThreadName = Thread.currentThread().getName();
        System.out.println("The current running thread name is: " + currentThreadName);
		System.out.println("executing run method");
	}
	
	
}

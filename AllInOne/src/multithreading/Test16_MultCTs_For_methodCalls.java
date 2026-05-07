package multithreading;
/**
 * Develop multiple custom threads for executing 
 * Example class methods m1(), m2(), and m3() methods concurrently
 */
class M1Thread extends Thread{

	@Override
	public void run() {
		Exampl.m1();
	}
	
}
class M2Thread extends Thread{

	@Override
	public void run() {
		Exampl.m2();
		
	}
	
}

class M3Thread extends Thread{

	@Override
	public void run() {
		Exampl.m3();
		
	}
	
}


public class Test16_MultCTs_For_methodCalls {

	public static void main(String[] args) {
System.out.println("main start");
		
		M1Thread mt1 = new M1Thread();
		M2Thread mt2 = new M2Thread();
		M3Thread mt3 = new M3Thread();
		
//		mt1.run();   //if i call run method then sequentially i will print 
//		mt2.run();
//		mt3.run();

		
		mt1.start();   //if i am calling start that will be print non sequentially
		mt2.start();
		mt3.start();
		System.out.println("main enddd");	

	}

}

package multithreading;
class A1 extends Thread{
	public void run() {
		System.out.println("HII");
		for(int i=10; i>=1;i--) {
			System.out.println("run method execution"+i);
		}	
	}
}
public class Examp {

	public static void main(String[] args) {
		A1 th1=new A1();
		th1.start();
		//th1.start();
		
		A1 th2=new A1();
		th2.start();
		for(int i=10; i>=1;i--) {
			System.out.println("main method execution"+i);
			
			
		}
		

	}

}

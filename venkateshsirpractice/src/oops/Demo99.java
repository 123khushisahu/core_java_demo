package oops;

class Multithreading7 implements Runnable{
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("javaEE");
				Thread.sleep(3000);
			}
		}catch (Exception e) {
System.err.println(e);		
}
	}

}
 public class Demo99 implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("CORE JAVA");
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			System.err.println(e);
		}
		
	}
	public static void main(String[] args) {
		Runnable r=new Multithreading7();
		Thread t=new Thread(r);
		t.start();
		Demo99 o=new Demo99();
		o.run();
		
	}
	
 }



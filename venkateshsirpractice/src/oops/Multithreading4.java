package oops;

public class Multithreading4 extends Thread{
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(getName()+":"+i);
				Thread.sleep(1000);		//for sleep time
			}
			
		}catch (Exception e) {
			System.err.println(e);		}
	}

	public static void main(String[] args) {
		Multithreading4 obj=new Multithreading4();
		obj.run();
	}

}

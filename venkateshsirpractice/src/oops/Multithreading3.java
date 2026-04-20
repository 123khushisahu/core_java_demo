package oops;

public class Multithreading3 extends Thread{
	public void run() {
		//=========child thread taskcode
		try {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread"+i);
			//System.out.println(getName()+":"+i);
			Thread.sleep(1000);
		}
	}catch (Exception e) {
		System.err.println(e);
	}
		// TODO: handle exception
	}

	public static void main(String[] args) {
		try {
		Multithreading3 obj=new Multithreading3();
		obj.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thrad:"+i);
Thread.sleep(2000);
		}
		//=====main thread task code
	}catch (Exception e) {
		System.err.println(e);
	}
	}

}

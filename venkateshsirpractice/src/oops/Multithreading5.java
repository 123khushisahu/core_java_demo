package oops;

public class Multithreading5 extends Thread{
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(getName()+":"+i);
				if(getName().equals("Child Thread1"))
					Thread.sleep(1000);
			else
				Thread.sleep(3000);
			}
		

	}catch(Exception e) {
System.err.println(e);	
}

}
public static void main(String[] args) {
	try {
		Multithreading5 obj1=new Multithreading5();
		obj1.setName("child thread1");
		obj1.start();
		
		Multithreading5 obj2=new Multithreading5();
		obj2.setName("child thread2");
		obj2.start();
		for(int i = 0;i<=10;i++) {
			System.out.println("Main Thread:"+i);
			Thread.sleep(2000);
		}

		
	
		
	}catch (Exception e) {
System.err.println(e);	
}
}
}

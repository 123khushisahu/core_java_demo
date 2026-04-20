package oops;

public class Multithreading6 implements Runnable{

	@Override
	public void run() {
		try {
			
		
for(int i=1;i<=10;i++) {
	System.out.println("core java");
	Thread.sleep(2000);
}
}catch (Exception e) {
	System.err.println(e);
	}
}
	public static void main(String[] args) {
		Runnable r=new Multithreading6();
		Thread t=new Thread(r);
		t.start();
			try {
				
			
	for(int i=1;i<=10;i++) {
		System.out.println("advance java");
		Thread.sleep(1000);
	}
	}catch (Exception e) {
		System.err.println(e);
	}
}
}	
		
	
	



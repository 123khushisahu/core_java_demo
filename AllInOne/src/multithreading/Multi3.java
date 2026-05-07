package multithreading;

public class Multi3 {
	public static void main(String[] args) {
		Thread th1=new Thread();
		System.out.println(th1.getName());
		
		Thread th2=new Thread("child2");
		System.out.println(th2.getName());
		System.out.println();
		th1.setName("child");
		System.out.println(th1.getName());
		System.out.println(th2.getName());
		
		System.out.println();
		Thread th3 = new Thread("Worker");
		Thread th4 = new Thread("Worker");
		System.out.println(th3.getName());
		System.out.println(th4.getName());

		MyThread18 mt1 = new MyThread18();
		MyThread18 mt2 = new MyThread18();
		mt1.setName("Driver");
		mt2.setName("Driver");
		
		//mt1.start();
		//mt2.start();
		
		//mt1.run();
		//mt2.run();
		
		
	}

}


class MyThread18 extends Thread{
	 MyThread18 (){
		
	}
	 MyThread18(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		//super.run();
		for (int i=1; i<=10; i++) {
			System.out.println(getName()+"run i:"+i);
		}
	}
	
	
}

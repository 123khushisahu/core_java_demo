package oops;

public class Multi_Threading_example  extends Thread{
	
	
	
	public void m1() {
		System.out.println("hi this is vijay code ............");
	}

	public static void main(String[] args) {
		
		Multi_Threading_example multi=new Multi_Threading_example();
		multi.start();
		multi.m1();

	}

}

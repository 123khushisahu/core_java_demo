package multithreading;
class Test1 extends Thread{
	public void run() {
		Flower.m1();
	}
	
}
class Test2 extends Thread{
	public void run() {
		Flower.m2();
	}
	
}
class Test3 extends Thread{
	public void run() {
		Flower.m3();
	}
	
}
	public class Flower2 {

	public static void main(String[] args) {
		Test1 th1=new Test1();
		Test2 th2=new Test2();
		Test3 th3=new Test3();
		
		th1.start();
		th2.start();
		th3.start();

	}

}

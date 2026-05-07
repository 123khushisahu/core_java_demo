package multithreading;
class Thread1 extends Thread{
	public void run() {
		System.out.println("hii");
		System.out.println("KHUSHI");
	}
}
public class tahir1 {

	public static void main(String[] args) {
//		System.out.println("BYE");=-
//		System.out.println("HELLO");


		Thread1 th1=new Thread1();
		th1.start();


		System.out.println("SAHU");
		
	}

}

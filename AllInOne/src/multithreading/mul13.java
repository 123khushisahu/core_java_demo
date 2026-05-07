package multithreading;
 class M extends Thread{

	@Override
	public void run() {
		System.out.println("HII");


	}
	 
 }
 class N extends Thread{
	 public void run() {
			System.out.println("RAM");

	 }
 }
 class O extends Thread{
	 public void run() {
		 Thread.yield();
			System.out.println("SITA");

	 }
 }
public class mul13 {

	public static void main(String[] args) {
		System.out.println("HELLO");
		M th1=new M();
		N th2=new N();
		O th3=new O();
		th3.start();
		//th1.run();   //sequentially print
		System.out.println("KHUSHI");

	}

}

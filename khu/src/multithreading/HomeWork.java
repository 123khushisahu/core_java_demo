package multithreading;

public class HomeWork {
	private int x;
	HomeWork(int x){
			this.x=x;
	}
	public void run() {
		for(int i=1;i<=2;i++) {
			System.out.println("main:"+i);
		}		
}
	public static void main(String[] args) {
		System.out.println("main start");
		HomeWork th1=new HomeWork(2);
		th1.run();
		System.out.println("run start");
		HomeWork th2=new HomeWork(2);
		th2.run();
		System.out.println("run end");
		System.out.println("main end");
	}

}

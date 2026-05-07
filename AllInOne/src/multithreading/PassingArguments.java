package multithreading;

public class PassingArguments extends Thread{
	private int x;
	PassingArguments(int x){
		this.x=x;
	}
	public void run() {
		for(int i=1; i<=x; i++) {
			System.out.println("run method start:" +i);
		}
	}

	public static void main(String[] args) {
		PassingArguments th1=new PassingArguments(10);
		th1.start();
		
		
		PassingArguments th2=new PassingArguments(5);
		th2.start();
		
		for(int i=1; i<=20; i++) {
			System.out.println(i);
		}

	}

}

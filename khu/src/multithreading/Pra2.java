package multithreading;

public class Pra2 extends Thread{
	private int x;
	 Pra2(int x){
		 this.x=x;
	}
	
	public void run() {
		for(int i=1; i<=x; i++) {
		System.out.println(i);
	}
	}

	public static void main(String[] args) {
		Pra2 th1=new Pra2(4);
		th1.start();
	}

}

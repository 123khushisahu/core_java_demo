package oops;
//program to demonstrate suspend() & resume() methods
public class Multithreading extends Thread {
	public void run() {
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println("child Thread:"+i);
				Thread.sleep(1000);
			}
		}catch (Exception e) {
			System.err.println(e);
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		Multithreading d=new Multithreading();
		d.start();
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println("main Thread:"+i);
				Thread.sleep(1000);
				
				
			}
		}catch (Exception e) {
			System.err.println(e);
			
		}
	}

}

package multithreading;


class Addition extends Thread{
	int sum=1;
	public void run() {
		for(int i=2; i<=5;i++) {
			sum=sum+i;
			System.out.println("ADDITION"+sum);
		}
	}
	
}
class Substraction extends Thread{
	int sub=1;
	public void run() {
		for(int i=2;i<=4;i++) {
			sub=sub-i;
			System.out.println("SUBSTRACTION"+sub);
		}
		
	}
	
}
class Multiplication extends Thread{
	int multiple=1;
	public void run() {
		for(int i=2;i<=3;i++) {
			multiple=multiple*i;
			System.out.println("MULTIPLE"+multiple);
		}
	}
	
}




public class Main {

	public static void main(String[] args) {
		Addition th1=new Addition();
		Substraction th2=new Substraction();
		Multiplication th3=new Multiplication();
		
		th1.start();
		th2.start();
		th3.start();
	}

}

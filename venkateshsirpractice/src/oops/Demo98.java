package oops;

 class Demo94 {
	float balance=5000.00f;
	synchronized void withdraw(float amount) {
		try {
			System.out.println("withdraw started........");
			if(balance<amount) {
				System.out.println("less balance,waiting for deposit");
				wait();
			}
			balance=balance-amount;
			System.out.println("withdraw completed");
	}catch (Exception e) {
System.err.println(e);	
}
	}
	synchronized void deposit(float amount)
	{
		System.out.println("deposit stARTED");
		balance=balance+amount;
		System.out.println("deposit completed");
		notify();
	}
}
class Customer1 extends Thread{
	Demo94 b;
	Customer1(Demo94 b){
		this.b=b;
	}
	public void run() {
		b.withdraw(6000.00f);
	}
}

class Customer2 extends Thread{
	Demo94 b;
	Customer2(Demo94 b){
		this.b=b;
	}
	public void run() {
		b.deposit(60000.00f);
	}	
}

 public class Demo98{
	public static void main(String[] args) {
		Demo94 b=new Demo94();
		Customer1 c1=new Customer1(b);
		c1.start();
		Customer2 c2=new Customer2(b);
		c2.start();
	}
 }


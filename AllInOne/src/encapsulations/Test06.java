package encapsulations;

public class Test06 {

	public static void main(String[] args) {
		Bank6 b1 = new Bank6();
		b1.withdraw(2000);
		//System.out.println(b1.getBalance());
		System.out.println(b1.balance);

	}
}

class Bank6{
	 public int balance;
	//private int balance;
	
	public void withdraw(int amount) {
		 if(amount > 0) {
			 balance = balance+amount;
		 }
	 }

	public int getBalance() {
		return balance;
	}
	 
}

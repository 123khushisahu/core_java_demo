package novemberprogram;

public class BankAccount {
private	double balance;

	
	void deposit(double amt) {
		balance=balance+amt;
	}
	public static void main(String[] args) {		
		BankAccount acc1=new BankAccount();
		acc1.deposit(5000);
		System.out.println(acc1.balance);
		
		BankAccount acc2=new BankAccount();
		acc2.balance=acc2.balance+7000;
		
		System.out.println(acc2.balance);
	}

}

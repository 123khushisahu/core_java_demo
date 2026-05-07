package novemberprogram;

public class BanckAcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1=new BankAccount();
		acc1.deposit(5000);
		System.out.println(acc1.balance);
		BankAccount acc2=new BankAccount();
		acc2.balance=acc2.balance+7000;
		
		System.out.println(acc2.balance);
	}

}

package december;
public class Bank {
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		System.out.println("acc1 object is created");

		System.out.println("\nacc1 object values");
		acc1.display();
		System.out.println();
		
		if(acc1.getactive())
			System.out.println("acc1 is active");
		else
			System.out.println("acc1 is not active");
		
		//initializing object via setter methods
		acc1.setbankname("HDFC");
		acc1.setaccno(12345);
		acc1.setactive(true);

		System.out.println("\nacc1 object values");
		acc1.display();
		System.out.println();
		
		System.out.println(
			acc1.getactive() ? "acc1 is active" : "acc1 is not active");
		
	}
}
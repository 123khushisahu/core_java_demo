package day03;

public class BankAccount {

	public static void main(String[] args) {
		
		double balance=1000.00;
		int deposite=500;
		balance=balance+deposite;
		System.out.println("Balance "+balance);
		
		int withdrowAmount=2000;
		if(balance<800) System.out.println("Insufficint Fund");
		balance=balance-withdrowAmount;
		int convertedValue=(int)balance;
		System.out.println("Total Amount is "+convertedValue+" After withdrowing "+withdrowAmount+" amount");
	}

}

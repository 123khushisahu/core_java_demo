package day04;

public class BankInterest {

	public static void main(String[] args) {
		int amount=10000;
		float rate=6.5f;
		double interest=amount*6.5/100;
		System.out.println(interest);
		int totalamount=amount+(int)(interest);
		System.out.println(totalamount);
	}

}

package day03;

public class RestaurantBillingSystem {

	public static void main(String[] args) {
		float base=500;
		 int taxPercent=5;
		float discountPercent=10;
	double finalBill = base + (base * taxPercent / 100) - (base * discountPercent / 100);
	System.out.println("finalBill="+finalBill);
		 }

}

package day01;

public class RestaurantBill {

	public static void main(String[] args) {
int foodBill=350;
int drinkbill=150;
double tax=0.05;
double taxbill=(foodBill+drinkbill)*0.05;
double totalbill=(foodBill + drinkbill) + (foodBill + drinkbill);
System.out.println(totalbill);
System.out.println(taxbill);
System.out.println(totalbill+(taxbill*2));

	}

}

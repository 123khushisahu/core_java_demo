package day03;

import java.util.Scanner;

public class Product {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	String name="khushi";
	System.out.println("Enter price");
	float price=sc.nextFloat();
	
	float disc=price*10/100;
	System.out.println(disc);
	
	float finalPrice=price-disc;
	System.out.println("The final price is "+finalPrice);
	
}
}

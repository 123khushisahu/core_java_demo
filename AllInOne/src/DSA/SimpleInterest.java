package DSA;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER principal:");
		Double p=sc.nextDouble();
		
		System.out.println("ENTER rate:");
		Double r=sc.nextDouble();
		
		System.out.println("ENTER time:");
		Double t=sc.nextDouble();
		
		Double si=(p * r * t)/100;
		 
		System.out.println("simple Interest="+si);
		
		
		
	}

}

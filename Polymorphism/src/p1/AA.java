package p1;

import java.util.Scanner;

public class AA {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		System.out.println("Enter b number:");
		int b = sc.nextInt();
		
		if(a==0 || b==0) {
			throw new ArithmeticException("dont pass the values of a and b as zero");
		}
		int c=a/b;
		System.out.println(c);
	}}



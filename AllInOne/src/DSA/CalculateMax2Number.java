package DSA;

import java.util.Scanner;

public class CalculateMax2Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println("max="+a);
		}else
		{
			System.out.println("max="+b);
		}
	}

}

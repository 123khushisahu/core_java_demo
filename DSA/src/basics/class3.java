package basics;

import java.util.Scanner;

public class class3 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any random number::");
//		int num = sc.nextInt();
//
//		if (num % 2 == 0) {
//			System.out.println(num + " is a even number");
//		} else
//			System.out.println(num + " is a odd number");
	
		
		//2 example
		
		
		
//		int num = 7;
//
//		if (num % 2 == 0) {
//		    System.out.println("Even");
//		} else {
//		    System.out.println("Odd");
//		}
		
		
		
		//3rd example
		
		
//		int num=0;
//		if(num>0) {
//			System.out.println("positive");
//		}else if(num<0) {
//			System.out.println("NEGATIVE");
//		}else {
//			System.out.println("zero");
//		}
//		
		
		
		
		
		//4rth example
		
		
		
//		int a=10,b=20;
//		if(a>b) {
//			System.out.println("a is greater");
//		}else {
//			System.out.println("b is greater");
//		}
		
		
		
		
		//5th example
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("ENTER ANY NUMBER");
//		int age=sc.nextInt();
//		
//		//int age=18;
//		if(age>=18) {
//			System.out.println("U R ELIGIBLE FOR VOTING");
//		}else {
//			System.out.println("u r not eligible");
//		}
		
		
		
		
		//6th example
		
		
		
		//int year=2024;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		if((year%4==0&& year%100!=0)||(year%400==0)) {
			System.out.println("LEAP YEAR");
		}else {
			System.out.println("NOT LEAPYEAAR");
		}
		
	}

}

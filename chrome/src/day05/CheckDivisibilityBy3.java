package day05;

import java.util.Scanner;

public class CheckDivisibilityBy3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int result=SumOfDigit.sum(num);
		if(result%3==0) {
			System.out.println("num is divisible/3");
		}
		else {
			System.out.println("num is not divisible/3");

		}
	}

}

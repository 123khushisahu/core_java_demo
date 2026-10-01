package codeChallengePractice;

import java.util.Scanner;

public class ifElse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	if(x%2==0) {
		System.out.println("even");
		if(x<=10) {
			System.out.println("hii");
		}else if(x<=20) {
			System.out.println("hello");
		}else if(x>20) {
			System.out.println("bye");
		}
		
		
	}else {
		System.out.println("Odd");
		System.out.println("Hello");
	}
}
}

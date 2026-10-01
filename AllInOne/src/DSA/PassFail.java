package DSA;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int marks=sc.nextInt();
		String result=(marks>=33) ? "pass":"fail";
		System.out.println(result);
//		if(marks>=33) {
//			System.out.println("pass");
//		}else {
//			System.out.println("Fail");
//		}
	}

}

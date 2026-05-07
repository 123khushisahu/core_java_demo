package DSA;

import java.util.Scanner;

public class class5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter grade");
		int marks=sc.nextInt();
		if(marks >= 90) {
		   System.out.println("Grade A");
		} else if(marks >= 75) {
		    System.out.println("Grade B");
		} else if(marks >= 50) {
		    System.out.println("Grade C");
		} else {
		    System.out.println("FAIL");
		}
	}

}

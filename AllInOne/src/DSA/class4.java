package DSA;

import java.util.Scanner;

public class class4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER MARKS");
		int  marks=sc.nextInt();
		
		
		if(marks >= 40) {
		    System.out.println("PASS");
		} else {
		    System.out.println("FAIL");
		}
	}

}

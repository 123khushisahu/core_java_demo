package DSA;

import java.util.Scanner;

public class elseIf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int marks=sc.nextInt();
		if(marks>90) {
			System.out.println("1st Devision");
		}else if(marks>80){
			System.out.println("2nd Devision");
		}else if(marks>70) {
			System.out.println("3rd Devision");
		}else {
			System.out.println("Fail");
		}
	}

}

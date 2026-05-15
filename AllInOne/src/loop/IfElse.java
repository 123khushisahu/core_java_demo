package loop;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age!!!");
		int age=sc.nextInt();
		//int age=18;
		if(age>=18) {
			System.out.println("YOU ARE ELIGIBLE FOR VOTING!!!!");
		}else
		{
			System.out.println("YOU ARE NOT ELIGIBLE FOR VOTING!!!!");
		}
	}

}

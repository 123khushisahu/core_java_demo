package loop;

import java.util.Scanner;

public class if_Else_Elseif {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int marks=sc.nextInt();
	if(marks>=90)
	{
		System.out.println("You have grade-A");
	}
	else if(marks>=80)
	{
	System.out.println("You have grade-B");	
	}
	else if(marks>=70)
	{
		System.out.println("You have grade-C");
	}
	else
	{
		System.out.println("You are fail!!");
	}
}
}

package Day6;

import java.util.Scanner;

public class ComputationNumber
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:: ");
		int num=sc.nextInt();
		System.out.print("Enter  second value:: ");
		double d=sc.nextDouble();
		double res=
				d * (num - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println(res);
	}

}

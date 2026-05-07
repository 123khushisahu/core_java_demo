package DSA;

import java.util.Scanner;

public class DrivingLicenceAgeChecking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("ELIGIBLE FOR DRIVINGlICENCE:");
		}else
		{
			System.out.println("NOT ELIGIBLE FOR DRIVING LICENCE:");
		}
	}

}

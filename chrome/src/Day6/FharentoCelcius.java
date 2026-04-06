package Day6;

import java.util.Scanner;

public class FharentoCelcius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number::");
		double n=sc.nextDouble();
		double celcius=(5*(n-32))/9;
		System.out.println(n+" degree Fahrenheit is equal to "+celcius+" in Celsius");

	}

}

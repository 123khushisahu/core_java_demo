package Day6;

import java.util.Scanner;

public class InchestoMeter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number in inches::");
		int n=sc.nextInt();
		double meter=n*0.0254;
		System.out.println(n+" Inches is equal to "+meter+" meters");
		int inches=(int)(meter*39.3701);
		System.out.println(meter+" meters is equal to "+inches+" inches");

	}

}

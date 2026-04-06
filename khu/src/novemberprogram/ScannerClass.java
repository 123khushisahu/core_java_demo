package novemberprogram;

import java.util.Scanner;

	class ScannerClass{
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter first number:");
	int a=scn.nextInt();
	System.out.print("Enter second number:");
	int b=scn.nextInt();
	int c = a + b; // ✅ perform addition
    System.out.println("Result = " + c); // ✅ display result

    scn.close(); // ✅ good practice
	
		
		
		
		
	}
}

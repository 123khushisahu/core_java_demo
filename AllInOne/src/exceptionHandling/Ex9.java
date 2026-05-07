package exceptionHandling;

/*
17. Redevelop above program to ask user to enter 
    only the present value which is given wrong, 
	but not from first value
*/
import java.util.Scanner;
import java.util.InputMismatchException;

class Ex9{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	   int a;
		while(true) {
			try{
				System.out.print("Enter FNO: ");
				a = scn.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Error: Enter only integer\n");
				scn.nextLine(); //removing wrong value from scn object
			}
		}
		
		while(true) {
			try{
				System.out.print("Enter SNO: ");
				int b = scn.nextInt();
				
				int c = a/b;
				System.out.println("Result: "+ c);
				break;
				
			}catch(InputMismatchException e) {
				System.out.println("Error: Enter only integer\n");
				scn.nextLine(); //removing wrong value from scn object
			
			}catch(ArithmeticException e) {
				System.out.println("Error: Do not enter ZERO as second value\n");
			}
		}//while end
	}
}
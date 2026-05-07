package exceptionHandling;
/*
16. Develop a program to read two integers from end-user by using Scanner
    divide them and print result
    
	Handle the exception thrown from the Scanner methods
*/
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ex4 {
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);		try{

				System.out.print("Enter FNO: ");
				int a = scn.nextInt();

				System.out.print("Enter SNO: ");
				int b = scn.nextInt();
				
				int c = a/b;
				System.out.println("Result: "+ c);

			}catch(InputMismatchException e) {
				System.out.println("Error: Enter only integers\n");

			}catch(ArithmeticException e) {
				System.out.println("Error: Do not enter ZERO as second value\n"+e);
			
			}	
			
		}
}
		
	
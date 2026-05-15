package DSA;

import java.util.Scanner;

public class SwitchLenthy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("choose operation!");
        System.out.println("1:Addition (+)");
        System.out.println("2:Substraction (-)");
        System.out.println("3:Multiplication (*)");
        System.out.println("4:Division (/)");
        System.out.println("5:Modulo (%)");
        
        int choice=sc.nextInt();
        
        //switch case
        switch(choice) {
        case 1:System.out.println("Addition="+(a+b));
        break;
        case 2:System.out.println("Substraction="+(a-b));
        break;
        case 3:System.out.println("Multiplication="+(a*b));
        break;
        case 4:if(b !=0) {
        		System.out.println("Division="+(a/b));
        }else {
        	System.out.println("can't devide by zero");
        }
        break;
        case 5:System.out.println("Module="+(a%b));
        break;
        default:
        	System.out.println("Invalid Choice");
          break;
		
        }
	}
}

package novemberprogram;
//develop a program to read number and find whether given number is even or odd
import java.util.Scanner;
public class EvenOddNo {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter number");
	int num=scn.nextInt();
	if(num%2==0){
		System.out.println("num is even");
	}
	else  {
		System.out.println("num is odd");
	}
	
	

	}

}

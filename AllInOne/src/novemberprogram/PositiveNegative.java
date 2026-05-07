package novemberprogram;
//develop a program read a number from keyboard check whether  it is positive or negative number and print the massage
import java.util.Scanner;
public class PositiveNegative {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter number:");
	int num=scn.nextInt();
	if(num>0) {
		System.out.println("num is positive");
	}
	else if(num<0){
		System.out.println("num is negative");
		
	}
	else {
		System.out.println("num is zero");
	}
		
	}

}

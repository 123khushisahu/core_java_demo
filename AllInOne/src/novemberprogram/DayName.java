package novemberprogram;
//develop a program to reading number 1 to 7 print day name for the given number starts with sunday
//input:1
//output:today is sunday
import java.util.Scanner;
public class DayName {

public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("Enter number (1_7):");
int num=scn.nextInt();
if(num==1) {
	System.out.println("Today is sunday");
}
else if(num==2) {
	System.out.println("Today is monday");
}
else if(num==3) {
	System.out.println("Today is tuesday");
}
else if(num==4) {
	System.out.println("Today is wednesday");
}
else if(num==5) {
	System.out.println("Today is thursday");
}
else if(num==6) {
	System.out.println("Today is friday");
}
else if(num==7) {
	System.out.println("Today is saturday");
}
else{
	System.out.println("invalid number");
}

	}

}

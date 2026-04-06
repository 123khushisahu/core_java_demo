package Day6;

import java.util.Scanner;

public class BinaryAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first number");
      int num1 = sc.nextInt();//1
      System.out.println("Enter the Second Number");
      int num2=sc.nextInt();//2
      int sum=num1+num2;//3
      String add=Integer.toBinaryString(sum);//11
      System.out.println(add);
      
	}

}

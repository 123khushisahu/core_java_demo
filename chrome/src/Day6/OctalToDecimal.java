package Day6;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a octalnumber::");
		int count=0;
		int sum=0;
		int num=sc.nextInt();
		int temp=num;
		while(num!=0) {
			int res=num%10;
			int res1=(int)Math.pow(8,count);
			sum+=res*res1;
			count++;
			num/=10;
		}
		System.out.println(temp+" is converting to decimalform "+sum);
		
		
		
		

	}

}

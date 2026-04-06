package day05;

public class SumOfDigit {
	
	public static int sum(int num) {
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		
		return sum;
	}
	
public static void main(String[] args) {
	int num=236;
	int result=sum(num);
	System.out.println(result);
}
}

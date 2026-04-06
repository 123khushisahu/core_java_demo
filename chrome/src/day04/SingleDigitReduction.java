package day04;

public class SingleDigitReduction {
	
	public static int reduceNumber(int num) {
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			sum+=digit;
			num/=10;
		}
		return sum;
	}
	
	public static void even() {
		int lastdigit=8;
		int diff=2;
		int missing=lastdigit+diff;
		System.out.println(missing);
	}
	
	
	
public static void main(String[] args) {
	int num=456746578; //
	
	while(num>9) {
			int result =reduceNumber(num);
			num=result;
			System.out.println(" temp result "+result);
	}
	System.out.println(num);
	
	even();
}
}

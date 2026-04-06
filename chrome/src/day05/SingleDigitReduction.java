package day05;

public class SingleDigitReduction {

	public static void main(String[] args) {
	int num=4567;
	while(num>9) {
		int result=SumOfDigit.sum(num);
		num=result;
		
	}
	
	System.out.println(num);
	}

}

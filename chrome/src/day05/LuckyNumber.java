package day05;

public class LuckyNumber {

	public static void main(String[] args) {
		int num=58;
		while(num>9) {
			int result=SumOfDigit.sum(num);
			num=result;
		}
		System.out.println(num);
	}

}

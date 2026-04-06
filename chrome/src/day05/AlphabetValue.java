package day05;

public class AlphabetValue {
public static void main(String[] args) {
	String name="BOB";
	int totalNumber=0;
	
	for(int i=0;i<name.length();i++) {
		char c=name.charAt(i);
		int num=0;
		for(char j='A';j<='Z';j++) {
			num+;
			if(c==j) {
				System.out.println();
				totalNumber+=num;
			}
		}
	}
	
	while(totalNumber>9) {
		int result=SumOfDigit.sum(totalNumber);
		totalNumber=result;
	}
	System.out.println(totalNumber);
}
}

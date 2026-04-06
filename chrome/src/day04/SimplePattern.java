package day04;

public class SimplePattern {

	public static void main(String[] args) {
		int first=2;
		int last =8;
		int diff=100;
		byte a=((byte) diff);
		System.out.println(a++);
		
		int result=last+diff;
		System.out.println(result);
	}

}

/*
 * 🪄 7️⃣ Simple Pattern
 * 
 * Question: Find the missing number: 2, 4, 6, 8, ___
 * 
 * Explanation: It increases by +2 each time. → Next number = 10
 * 
 * ✅ Answer: 10
 */
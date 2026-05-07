package practice;

public class X {
	
	public int countofcharacters(String x) {
	
		int count=0;
	for(int i=0;i<x.length();i++) {
		
		
		count++;
	}
	return count;
	}
	public static void main(String[] args) {
		String x="ram";
		X a1 = new X();
		System.out.println(a1.countofcharacters(x));
		
	}

}

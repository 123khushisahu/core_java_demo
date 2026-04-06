package exceptionHandling;

public class Exc10 {
		
		static int add(int a, int b)throws IllegalArgumentException {
			if(a<0 || b<0){
				throw new IllegalArgumentException("Donot pass -ve numbers");
			}
				
			int c = a + b;
			return c;
		}
		
	}
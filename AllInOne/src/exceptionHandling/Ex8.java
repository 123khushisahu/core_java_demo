package exceptionHandling;

class Ex8 {
	public static void main(String[] args) {
		
		try{			
			
			int a = Integer.parseInt(args[100]);
			int b = Integer.parseInt(args[2]);
			int c = a / b;
			System.out.println("Result: " + c );
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error: Please pass two integers, as below");
			System.out.println("     >java Division 10 2");
			
		}catch(NumberFormatException e){
			System.out.println("Error: Please pass only integers");	
			
		}catch(ArithmeticException e){
			System.out.println("Error: Please donot pass zero as second value");
		}
		
		
	}
}

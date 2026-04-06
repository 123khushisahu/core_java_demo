package method;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		
		
		//try {
			
		

	//}catch(ArithmeticException e){
	//	System.out.println("Don't enter 0");
	//}
		
	}

}

class Demo1{
	int balance=1000;
	int amount;
	
	public void withdraw(int amount) {
		if(amount>1000) {
			System.out.println("no sufficient balance");
		}else {
			System.out.println("withdraw");
			
		}
	}
	
}

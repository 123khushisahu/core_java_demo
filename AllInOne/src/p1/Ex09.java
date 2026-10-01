package p1;

public class Ex09 {

		
		public static void main(String[] args) {
			try{
				m1();
			}catch(ArithmeticException e){
				System.out.println(e); //e.toString()
			}	
			
			System.out.println("main end");
		}
		
		static void m1() throws ArithmeticException 
		{

			throw new ArithmeticException("/ by zero");

		}
	}



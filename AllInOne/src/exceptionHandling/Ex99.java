package exceptionHandling;

public class Ex99 {
		public static void main(String[] args) {
			
		//----------------------------------------------------
			try{
				System.out.println("In try");
				
			}catch(ArithmeticException e){
				System.out.println("In catch");	
				
			}finally{
				System.out.println("In finally");
				
			}
			System.out.println("after try,catch,finally");
		//----------------------------------------------------
			try{
				System.out.println("In try");
				System.out.println(10/0);	
				
			}catch(ArithmeticException e){
				System.out.println("In catch");	
				
			}finally{
				System.out.println("In finally");
				
			}
			System.out.println("after try,catch,finally");
//		//----------------------------------------------------
			try{
				System.out.println("In try");
			}finally{
				System.out.println("In finally");
			}
			System.out.println("after try,finally");
//		//----------------------------------------------------
			try{
				System.out.println("In try");
				System.out.println(10/0);
			}finally{
				System.out.println("In finally");
			}
			System.out.println("after try,finally");

		}
	}
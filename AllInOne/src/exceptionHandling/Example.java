package exceptionHandling;

public class Example {
	   static void m1() {
		System.out.println("m1 is executed");
	   }

	   static void m2() {
		System.out.println("m2 is executed");
	   }
	
	   public static void main(String[] args) {
		System.out.println("main execution start");
		          m1();
			  m2();
			  
			  m2();
			  m1();
			  
			  m3();
		System.out.println("main execution end");
	   }
	   
	   static void m3(){
		System.out.println("m3 is executed");
	   }

	   static void m4(){
		System.out.println("m3 is executed");
	   }
	}

	   
//	>javac Example.java
//	  |-> Example.class
//	 
//	>java Example  
//		main execution start
//		m1 is executed
//		m2 is executed
//		m2 is executed
//		m1 is executed
//		m3 is executed
//		main execution end
//		
//		Note: m4() method is not executed,
//		      because we have not called,
//		      but it has memory because of static kw
//		      
//		Note: we can define a method either before or after   
//		      main method and can call it from main method.
//		      
//23. Can we call one UDM m2() from other UDM m1()?
//	- Yes, it is possible
//	
//24. Just by calling m2() from m1(), is m2() executed?
//	- No, 
//	- first we must call m1() from main method
//
/
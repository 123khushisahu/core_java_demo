package p1;

public class CheckedUnchecked {
		static void m1()  {
			throw new ArithmeticException();			
		}

		static void m2()  {
//			throw new ClassNotFoundException();	
		}


		static void m3() {
			try{
				throw new ClassNotFoundException();		
			}catch(ClassNotFoundException e){
			                 
			}
		}

		static void m4() throws ClassNotFoundException { 
			throw new ClassNotFoundException();
		}
		
		static void m5() {
	      	//m4();						
		}

		static void m6() {
			try{
				m4();													
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}

		static void m7() throws ClassNotFoundException {
			m4();							
		}

		public static void main(String[] args) throws ClassNotFoundException {
			m7();							
			System.out.println("main end");
		}
		
		static void m8() {
			try{ 		}
			catch(ArithmeticException e){  } 
			catch(NullPointerException e){  }
	    //    catch(ClassNotFoundException e){  }	
	    //    catch(InterruptedException e){  }		
			catch(Error e){  }
			catch(RuntimeException e){  }
			catch(Exception e){  }					
			catch(Throwable e){  }				
		}
		
		

		static void m81() {
			//throw new Exception();				
		}

		static void m82(){
			//throw new Throwable();
		}

		static void m9() throws ClassNotFoundException {
	                                   
		}

		static void m10() {
	     	//m9();  
		}

		static void m11() throws ClassNotFoundException{
			m9();
		}

		static void m12() throws ClassNotFoundException{
			try{	
				m9();
			}catch(ClassNotFoundException e){		}
		}
	/* */
	}

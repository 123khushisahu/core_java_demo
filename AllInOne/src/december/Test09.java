package december;
	class Test09 {
		//jvm get static block priority
		
			static {
				System.out.println("Test class is loaded, SB is executed");
			}
			
		public static void main(String[] args) {
			Aa a1=new Aa();
			Bb b1=new Bb();
			C c1 = new C();
			D d1 = new D();
		}
		static {
			System.out.println("Test class is loaded, SB is executed");
		}
	}
	class Aa{
		static {
			System.out.println("A class is loaded, SB is executed");	
		}
	
	}
	class Bb {
		static {
			System.out.println("B class is loaded, SB is executed");	
		}
	
	}
	class C {
		static {
			System.out.println("C class is loaded, SB is executed");	
		}
	
	}
	class D {
		static {
			System.out.println("D class is loaded, SB is executed");	
		}
	
	}
	 
	
	
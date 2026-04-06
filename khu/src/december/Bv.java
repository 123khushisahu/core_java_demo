package december;
	class A {
		static void m1(){ 
			System.out.println("A m1");
		}
	}

	class Bv extends A {
		
		static void m1(){ 
			System.out.println("B m1");
			A.m1();
			
			A a1 = new B();
			a1.m1();
			
			//super.m1(); //CE:
		}
		void m2(){
			super.m1();
		}
		
		public static void main(String[] args) {
			System.out.println("B main");	
			m1();
			
			System.out.println();
			
			B b1 = new B();
			b1.m2();
		}
	}

}

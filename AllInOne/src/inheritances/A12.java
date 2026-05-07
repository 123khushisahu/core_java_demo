package inheritances;

public class A12 {
	static void m1() {
		System.out.println("A M1");
	}
	void m2() {
		System.out.println("A M2");
	}
	static void m3() {
		System.out.println("A M3 NO-PARAM");
	}
	int m3(String s) {
		System.out.println("A M3 STRING PARAM");
		return 50;
	}
}
	class B12 extends A12{
		static void m1() {
			System.out.println("B M1");
		}
		void m2() {
			System.out.println("B M2");
		}
		void m3 (float f,int x) {
			System.out.println("B M3 FLOAT,INT PARAM");
		}
		
	}



package oops;

public class DownUPCastingEx {

	 A a1 = new B();  //upca
	 
	 B b1 = (B) a1; //down
	 
	 /*long a=10;
	 
	 int b = (int) a;*/
	 
}

class A{
	void m1() {
		System.out.println("m1 of A");
	}
}

class B extends A{
	void m1() {
		System.out.println("m1 of B");
	}
}
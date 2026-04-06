package method;

public class CastingTest {
	
	public static void main(String[] args) {
		
		X a1 = new Y();//upcasting
		
		Y a3 = new Y();
		a3.meth2();
		
		Y a2 = (Y)a1;
		a2.meth1();
		
		
		
		
		
		
	}

}

class X{
	void meth1() {
		System.out.println("X class meth1");
	}
}

class Y extends X{
	
	void meth2() {
		System.out.println("y class meth2");
	}
	
	void meth1() {
		System.out.println("Y class meth1");
	}
	
}

class Z extends X{
	void meth1() {
		System.out.println("z class meth1");
	}
}

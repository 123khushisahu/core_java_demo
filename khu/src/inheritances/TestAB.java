package inheritances;

public class TestAB {

	public static void main(String[] args) {
		B12 b=new B12();   //for b class first check b class if not meet then go to parent class
		b.m1();
		b.m2();
		b.m3();
		b.m3("abc");
	//	b.m3(45.3,67);
		b.m3(45.3f,67);
		
		A12 d = new A12();
		d.m1();
		d.m2();
		d.m3("jshd");
		d.m3();
		
		A12 a=new B12();
		a.m1();
		a.m2();
		a.m3();
		a.m3("abc");
		
		B12 c = new B12();
		c.m3(45.3f,67);
		
	}

}

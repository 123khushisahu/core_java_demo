package november;

//package p2;
import novemberprogram.A;
class C extends A{
	public static void main(String[] args) {
		A a1 = new A();
//		System.out.println("a: "+a1.a);
//		System.out.println("b: "+a1.b);
//		System.out.println("c: "+a1.c);
		System.out.println("d: "+a1.d);

		C c1 = new C();
//		System.out.println("a: "+c1.a);
//		System.out.println("b: "+c1.b);
		System.out.println("c: "+c1.c);
		System.out.println("d: "+c1.d);

		A a2 = new C();
//		System.out.println("c: "+a2.c);
		System.out.println("d: "+a2.d);


		

		
	}
}

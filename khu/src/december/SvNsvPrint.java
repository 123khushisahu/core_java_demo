package december;

public class SvNsvPrint {
	static int a=100;
	int b=200;
		void m1() {
			System.out.println("m1 meth");
	}

	public static void main(String[] args) {
		SvNsvPrint m=new SvNsvPrint();
		m.m1();
		int a=10;
		System.out.println(a);
		System.out.println(SvNsvPrint.a);//solution to the shadow accessing sv by using className
		System.out.println(m.b);
		
	}

}

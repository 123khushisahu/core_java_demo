package novemberprogram;

//package p1;
public class F {
	private		static int a = 10;
				static int b = 20;
	protected	static int c = 30;   //protected static variable
	public		static int d = 40;		//in another package can be accessed 
											//by using its enclosing class F reference
	public static void main(String[] args) {
		System.out.println("a: "+ F.a);
		System.out.println("b: "+ F.b);
		System.out.println("c: "+ F.c);
		System.out.println("d: "+ F.d);
	}

}
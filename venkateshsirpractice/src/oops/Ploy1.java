package oops;

//compiletime polymorphism
public class Ploy1 {
	
	public void m1(int a,int b) {
		System.out.println("2 params");
	}
	
	public void m1(int a,int b,int c) {
		System.out.println("3 params");
	}

	
	public static void main(String[] args) {
		Ploy1 p = new Ploy1();
		p.m1(10, 20);
		p.m1(0);
	}

}

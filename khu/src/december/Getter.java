package december;

public class Getter {
	//static int b=10;
	int a=11;
	void m1() {
		int a=20;
		System.out.println(a);
		//System.out.println(b);
		System.out.println(this.a);
		
	}

	public static void main(String[] args) {
		Getter ob=new Getter();
		ob.m1();
	}

}

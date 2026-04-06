package method;

public class Method3 {
	static int a=11;
	int x=22;
	void change() {
		a=a+111;
		x=x+222;
		
	}

	public static void main(String[] args) {
		/*
		Method3 obj1=new Method3();
		obj1.change();
		System.out.println(Method3.a);

		Method3 obj2=new Method3();
		obj2.change();
		System.out.println(obj2.x);
*/
		
		Method3 obj1=new Method3();
		obj1.change();
		System.out.println(obj1.a+" "+obj1.x);
		Method3 obj2=new Method3();
		obj2.change();
		System.out.println(obj2.x+" "+obj2.a);

		

	}

}

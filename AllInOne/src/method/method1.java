package method;

public class method1 {
	static int a=10;
	int b=12;
	void change() {
		a=13;
		b=22;
	}

	public static void main(String[] args) {
		method1 obj=new method1();
		obj.change();

		
System.out.println(method1.a);


System.out.println(obj.b);

	}

}

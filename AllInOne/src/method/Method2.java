package method;

public class Method2 {
	static int a=101;
	int x=12;
	
	void change() {
		a=a+10;
		x=x+12;
	}
	

	public static void main(String[] args) {
		Method2 OBJ1=new Method2();
		OBJ1.change();
		System.out.println(Method2.a);
		Method2 OBJ2=new Method2();
		OBJ2.change();
		System.out.println(OBJ2.x);
		

	}

}

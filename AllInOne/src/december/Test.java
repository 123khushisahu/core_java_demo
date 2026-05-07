package december;

public class Test {
	int x=10;

	public static void main(String[] args) {
		Example e1=new Example();//whenever creating a object inside a method or constructor or block is called local object
		Example e2=new Example();
		//storing values or setting values
		e1.x=10;
		e1.y=20;
		e2.x=30;
		e2.y=40;
		//code redundancy
		System.out.println(e1.x);
		System.out.println(e1.y);
		System.out.println(e2.x);
		System.out.println(e2.y);
		//modifying or changing values
		System.out.println(e1.x);

	}

}

package method;

public class A {
	int x=100;
	int y=120;
	A(){                        //it's braces called as a constructor
		Example e=new Example();  //local object
		System.out.println(e.z);
	}
	void m1() {
		Example e = new Example();
		e.m2();          // e is a reference variable m2()is a method calling
	}
	public void display(Example e) {
		System.out.println("Z value in Example class::"+e.z);
	}

	public static void main(String[] args) {
		Example example =new Example();
		A a=new A();   //current object bcz same class object creation
		a.display(example);  //example is a argument
		a.m1();

	}

}

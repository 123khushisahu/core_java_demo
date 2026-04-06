package oops;

class A7{
	void show(String s) {
	System.out.println(s);	
	}
}

class c{
	static A7 a=new A7();
}
public class Ba4 {

	public static void main(String[] args) {
		c.a.show("welcome");
	}

}

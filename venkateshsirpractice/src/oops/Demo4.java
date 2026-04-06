package oops;
//is-a rel
class Aaaa{
	void min(int x) {
		System.out.println("HELLO");
	}
}
public class Demo4 extends A{

	public static void main(String[] args) {
		Aaaa ob=new Aaaa();
		ob.min(1);
	}

}

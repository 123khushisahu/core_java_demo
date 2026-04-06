package oops;

public class Demo5 {
	{
		System.out.println("BLOCK 1");
	}
	Demo5(){
		System.out.println("CONSTRUCTOR");
	}
	public static void main(String[] args) {
		new Demo5();
	}
	{
	System.out.println("BLOCK 2");
}


}

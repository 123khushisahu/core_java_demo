package december;

public class Example5 {
	static int a=10;
	int b=20;

	public static void main(String[] args) {
		 Example5 s = new Example5();
		int a=50;   //local var thatswhy
		System.out.println(a);
		System.out.println(Example5.a);  //static thats why call class
		System.out.println(s.b);  //non static thatswhy obj creat

	}

}

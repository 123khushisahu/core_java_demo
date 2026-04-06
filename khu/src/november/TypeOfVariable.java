package november;
final class _Hh{
	static int a=10;
	static int b=20;
	int x=30;
	int y=40;
	static int marks()
	{
		return 200;
	}
}
public class TypeOfVariable {

	int totalMarks(int a){
		System.out.println("totalMarks::"+a);
		return 300;
	}
	
	public static void main(String[] args) {
		System.out.println("a value::"+Example.a);
		System.out.println("b value::"+Example.b);
//		System.out.println(Example.x);
		Example e =new Example();
		static Example e1=new Example();
		System.out.println("x value::"+e.x+"\ny value::"+e.y);
		TypeOfVariable t=new TypeOfVariable();
		int b=t.totalMarks(Example.marks());
		System.out.println(b);
		
		

	}

}

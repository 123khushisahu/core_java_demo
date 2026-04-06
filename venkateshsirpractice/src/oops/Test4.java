package oops;
abstract class AnonymousClass
{
	abstract void meth1();
}
public class Test4 {

	public static void main(String[] args) {
		AnonymousClass obj=new AnonymousClass()
		{
			void meth1() 
			{
				System.out.println("HEY I AM ANONYMOUS");       //inner class
			}
		};
		obj.meth1();
	}

}

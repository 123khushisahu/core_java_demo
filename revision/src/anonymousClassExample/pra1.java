package anonymousClassExample;

 abstract class Anon{
	 abstract void meth1();
}
public class pra1 {
	public static void main(String[] args) {
		Anon a1=new Anon() {
			public void meth1() {
				System.out.println("hii");
			}
		};
		a1.meth1();
	}
	

}
//what is anonymous class?
//An anonymous class in Java is a class without a name.
//It is created and used at the same time while creating an object.
//It is mainly used for one-time use objects.

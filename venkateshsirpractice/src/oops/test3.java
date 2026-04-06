package oops;

class OuterClass
{
	void main() {
		System.out.println("HEY I AM OUTERCLASS!!!");
	}
	class InnerClass{
		void show() {
			System.out.println("hey i am inner class!!!");
		}
	}
}







public class test3 {

	

	public static void main(String[] args) {
		OuterClass obj=new OuterClass();
		obj.main();

		OuterClass.InnerClass obj2=obj.new InnerClass();
		obj2.show();

	}

}

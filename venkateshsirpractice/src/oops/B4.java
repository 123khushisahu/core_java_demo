package oops;

abstract class A4{
	abstract void show();
			void print() {
				System.out.println("print()method");
			}
}
public class B4 extends A4 {
	@Override
	void show() {
		System.out.println("show()method");
	}
	
	void display() {
		System.out.println("display()method");
	}
	
	public static void main(String[] args) {
		B4 ob=new B4();
		ob.show();
		ob.display();
		ob.print();
		
		
		
//		
//		A4 obj=new A4() {
//			 void show() {
//				 System.out.println("hey");
//			 }
//			
//		};
//		obj.show();

	}
	

}

package oops;
abstract class A2{
	abstract void show();
			void print() {
				System.out.println("print()method parent");
			}
	
}
public class Abstract extends A2{
	void show() {
		System.out.println("SHOW()METHOD");
	}
	void print() {
		System.out.println("print()method child");
	}

		void display() {
			System.out.println("DISPLAY()METHOD");
		}

	public static void main(String[] args) {
		Abstract ob=new Abstract();
		ob.show();
		ob.print();
		ob.display();
		
		
		A2 obj=new A2() {
			void show() {
				System.out.println("hey");
			}
			
		};
		obj.show();
		

	}

}

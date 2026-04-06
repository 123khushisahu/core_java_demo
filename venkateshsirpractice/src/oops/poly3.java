package oops;

class Aaaaa{
	void show() {
		System.out.println("A CLASS");
	}
	void print() {
		System.out.println("print()method");
	}
}
public class poly3 extends Aaaaa{
	void show() {
		System.out.println("B CLASS");
	}
	
	void display() {
		System.out.println("display()method");
	}

	public static void main(String[] args) {
		//poly3 ob=new poly3();
		Aaaaa ob2=new Aaaaa();
		ob2.show();
	ob2.print();
		//ob2.display();
	}

}

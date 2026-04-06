package oops;
//runtimepolymorphism
public class Poly2 {
	
	public static void main(String[] args) {
		Poly3 p = new Poly4();
		p.add(5);
	}
	
	
}

class Poly3{
public void add(int a) {
	System.out.println("Add from poly3");
	}
}


class Poly4 extends Poly3{
public void add(int a) {
	System.out.println("Add from poly4");
}

}


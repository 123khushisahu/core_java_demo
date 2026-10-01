package p1;

public class Parent {
public void show() {
	System.out.println("Show method parent class");
}
//overloading
public void show(int a,int b) {
	System.out.println("a "+a);
	System.out.println("b "+b);
	
	
}

public void show(int a,int b,int c) {
	System.out.println("a "+a);
	System.out.println("b "+b);
	System.out.println("c "+c);
}


   

}

package upcastingDowncasting;

public class A {
 A(int x){
		System.out.println("hi");
	}
}
 class B extends A{
	 
	 B(int y){
		super(3);  //by default super class constructor is there(param cons call)
		 System.out.println("HELLO");
		 
	 }
	 void display() {
		 System.out.println("HRU");
	 }
	 
 }
	



package oops;

import java.util.ArrayList;

public class Demo12 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		//autoboxing and upcasting
		a1.add(45);
		a1.add(83);
		a1.add(44);
		a1.add(45);
		a1.add(40);
		System.out.println(a1);			//a1.toString()
		
		
		//here aabstractCollection class tostring() method called.
		//it returns string representation of elements.
	
	}

}

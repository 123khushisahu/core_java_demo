package oops;

import java.util.HashSet;
import java.util.Iterator;

public class Dublicate_number {

	public static void main(String[] args) {
		System.out.println("hi this is my first commit of git code..........");
		
		int[] array= {1,2,3,4,4,5};
		
		HashSet<Integer>  arraylistobj=new HashSet<>();
		
		
		for(int num:array) {
			
			if(arraylistobj.contains(num)) {
				System.out.println("dublicate no."+num);
			}
			else {
				arraylistobj.add(num);
			}
			
			
			
		}
		
		
		

	}

}

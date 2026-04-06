package oops;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListt {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(34);
		System.out.println(a1);
		
		Iterator<Integer> i=a1.iterator();
		while(i.hasNext())
		{
			int x=i.next();
			System.out.println(x+5);
		}
	}

}

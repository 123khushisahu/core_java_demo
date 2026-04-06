package oops;

import java.util.ArrayList;

public class ArrayListForLoop {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(78);
		a1.add(77);
		a1.add(76);
		System.out.println(a1);
		for(int x :a1)
		{
			System.out.println(x+5);
		}
	}

}

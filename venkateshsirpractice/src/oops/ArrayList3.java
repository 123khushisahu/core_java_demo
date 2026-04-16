package oops;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(83);
		a1.add(45);
		a1.add(46);
		a1.add(47);
		System.out.println(a1);
		Collection.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
	}

}

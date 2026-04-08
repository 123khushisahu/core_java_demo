package oops;

import java.util.ArrayList;

public class Demo22 {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(78);
		a1.add(79);
		a1.add(77);
		a1.add(76);
		a1.add(75);
		System.out.println(a1);
		for(int x:a1)
		{
			System.out.println(x+5);
		}

}
}

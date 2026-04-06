package oops;
import java.util.ArrayList;
public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("james ");
		a1.add("ghosling");
		System.out.println(a1);
		a1.add(2,"chrish");
		System.out.println(a1);
		a1.add(3,"ed frank");
		System.out.println(a1);
		System.out.println(a1.get(0));
		for(String s:a1)
	{
			System.out.println(a1);
		}
	}

}

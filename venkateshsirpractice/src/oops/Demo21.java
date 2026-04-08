package oops;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo21 {

	public static void main(String[] args) {
ArrayList<Integer> a1=new ArrayList<>();
a1.add(78);
a1.add(79);
a1.add(77);
a1.add(76);
a1.add(75);
System.out.println(a1);
Iterator<Integer> i=a1.iterator();
while(i.hasNext()) {
	int x=i.next();
	System.out.println(x+5);
}
	}

}

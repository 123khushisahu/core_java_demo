package oops;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo25 {

	public static void main(String[] args) {
TreeMap<Integer,Float> tm=new TreeMap<>();
tm.put(101, 5000.00f);
tm.put(102, 5000.00f);
tm.put(103, 5000.00f);
tm.put(104, 5000.00f);
tm.put(105, 5000.00f);
System.out.println(tm);
Set<Map.Entry<Integer,Float>> s=tm.entrySet();
Iterator<Map.Entry<Integer,Float>> i=s.iterator();
while(i.hasNext())
{
	Map.Entry<Integer, Float> me=i.next();
	int x=me.getKey();
	float y=me.getValue();
	System.out.println(x+"\t"+(y+500.00f));
}


	}

}

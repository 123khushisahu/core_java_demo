import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class List_Interface_example {

	public static void main(String[] args) {
		
		
		System.out.println("hi this is collection in core java all topics .....");
		
	/*	Collection 
		1. list
		2. set 
		3. map
		4. queue */
	//---------------------------------------------	
		// Definition of List Interface Types

		/*
		1. ArrayList
		   ArrayList is a class that implements List interface.
		   It uses dynamic array to store data.
		   It allows duplicate elements and maintains insertion order.

		2. LinkedList
		   LinkedList is a class that implements List interface.
		   It uses doubly linked list data structure.
		   It allows duplicate elements and maintains insertion order.

		3. Vector
		   Vector is a class that implements List interface.
		   It is synchronized (thread-safe).
		   It allows duplicate elements and maintains insertion order.

		4. Stack
		   Stack is a subclass of Vector.
		   It follows LIFO (Last In First Out) principle.
		*/
		
		List<Integer>  list=Arrays.asList(1,2,3,4,5);
		
		LinkedList<Integer> lk=new LinkedList<>();
		
		lk.addAll(list);
		System.out.println(lk);
		
		
	  //	------------------------------------------------------------
		
       List<Integer>  list1=Arrays.asList(1,2,3,4,5);
		
		ArrayList<Integer> al=new ArrayList();
		
		al.addAll(list1);
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
		

	}

}

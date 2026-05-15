package com.java.fundamentals;
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
		
		List<Integer> lk=new LinkedList<>();
		
		lk.addAll(list);
		System.out.println(lk);
		
		
	  //	------------------------------------------------------------
		
       List<Integer>  list1=Arrays.asList(1,2,3,4,5);
		
		List<Integer> al=new ArrayList();
		
		al.addAll(list1);
		System.out.println(al);
		
		
		
		
		
	}

}

/*

list={1,2,3,4,5};


Linklist                                       arraylist
-----------------------------------------------------------------
faster                                            slower
size not fixed                                   size fixed
for insertion/deletion this is fast             for insertion/deletion this is slow
for select data this is slow                    for select data this is fast



1    - previous node ,next node                       1 - index no-0
2    - previous node ,next node                       2 - index no-1

                       
4    - previous node ,next node                       4 - index no-2
5    - previous node ,next node                       5 - index no-3

*/

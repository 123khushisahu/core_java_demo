package com.java.fundamentals;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface {

	public static void main(String[] args) {
		
		/* 
		 
		 * Set Interface in Java
		
		Definition

		Set is an interface in Java Collection Framework that stores unique elements only.
		It does not allow duplicate values.

		Important Points
		
		Duplicate elements are not allowed
		Stores only unique values
		Available in java.util package
		Set is implemented by:
		
		
		HashSet
		LinkedHashSet
		TreeSet   
		
		*/
		System.out.println("---- -------------------HashSet--------------------------");
		HashSet<String> s=new HashSet<>();
		
		s.add("java");
		s.add("khushi");
		s.add("manoj");
		s.add("dinesh");
		
		s.add("dinesh");
		
		s.add("manoj1");
		System.out.println(s);
		
		System.out.println("---- -------------------LinkedHashSet--------------------------");
		
        Set<String> s1=new LinkedHashSet();
		
		s1.add("java");
		s1.add("khushi");
		s1.add("manoj");
		s1.add("dinesh");
		
		s1.add("dinesh");
		
		s1.add("manoj1");
		System.out.println(s1);
		
		
		
		System.out.println("---------------------------------------treeset-----------------------------------");
		
		 Set<Integer> ts = new TreeSet<Integer>();

	        ts.add(50);
	        ts.add(10);
	        ts.add(30);
	        ts.add(20);
	        ts.add(10); // Duplicate value

	        System.out.println(ts);
		
		
		
		
		

	}

}

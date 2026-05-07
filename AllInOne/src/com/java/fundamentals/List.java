package com.java.fundamentals;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		
		        ArrayList<String> al = new ArrayList<String>();

		        al.add("Java");
		        al.add("Python");
		        al.add("C++");

		        System.out.println("ArrayList Elements : " + al);

		        System.out.println("Element at index 1 : " + al.get(1));

		        al.remove("Python");

		        System.out.println("After Removing : " + al);
		        al.set(0, "hii");
		        System.out.println("After Adding"+al);
		        
		    }
		
	}



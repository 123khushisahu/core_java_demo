package com.java.fundamentals;

import java.util.LinkedList;

public class ArrayList1 {
	public static void main(String[] args) {
		LinkedList<Object>  list  =  new LinkedList();
	     list.add(100);
	     list.add("abc");
	     list.add(88);
	     list.add(99);
	     list.add('A');
	     
	     System.out.println(list.get(1));
    
	}

}

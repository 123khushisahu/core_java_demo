package com.java.fundamentals;



//In Java Collection Framework, Queue is an interface used to store elements in an order for processing.
//FIFO (First In First Out)
// The element added first is removed first.
import java.util.LinkedList;
import java.util.Queue;

public interface Queue1 {
	
	    public static void main(String[] args) {

	    	Queue<Integer> q = new LinkedList<>();

	        q.add(10);
	        q.add(20);
	        q.add(30);

	        System.out.println(q);

	        q.remove();

	        System.out.println(q);
	    }
	}




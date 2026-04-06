package oops;

import java.util.ArrayList;

public class Array {
	
	
	public void m1()
	{
		
		
		System.out.println("hiii");
	}

	public static void main(String[] args) {
	//	Array aa= new Array();
	//	aa.m1();
		//============>[]-Array
		//double  []num[] = {inrtegr}
		
	//	int number[]  =  {20,30,40,50,60};          //array data
//		int number1[] = 
		
		int arr[] = {10,20,30,40,50};
		
		// array index-->0 to   start +   length--> 1 tostart
		
		System.out.println(arr[4]);
		System.out.println(arr[0]);
		
		
		
		
		
		
		ArrayList<Object>  list= new ArrayList();         //create a object of arraylist
		
		
		list.add(10);
		list.add(200);
		list.add("java");
		list.add('A');
		list.add("ma");
		
		System.out.println(list);
		
		list.add("nareshit");
		
		System.out.println(list);
		
	}

}

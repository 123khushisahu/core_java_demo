package com.java.fundamentals;

import array.Array1;

public class Arrays_java_example {

	public static void main(String[] args) {
		
		/*Java Arrays
		Arrays are used to store multiple values in a single variable, instead of 
		declaring separate variables for each value.
		To declare an array, define the variable type with square brackets [ ] :
		
		
		We have now declared a variable that holds an array of strings. 
		To insert values to it, you can place the values 
		in a comma-separated list, inside curly braces { }:*/
		
		//1. String in Array
		
		String[] myarray= {"Vijay","ajay","denny","sohan"};
		System.out.println(myarray);
		
		System.out.println(myarray[0]+ ' '+myarray[1]+ ' '+ myarray[2]+ ' '+ myarray[3]);
		
		System.out.println("------------------------------------------------------------------------");
		
		//for each syntax
		
		//for(datatype variable : array_or_collection)
		//{   
		    // code
		//}
		for(String arrays : myarray) {
			
			System.out.println(arrays );
			//System.out.print(arrays + ' ');
			
		}
		
		
		System.out.println("----------------------if i want to print Integer-------------------------------");
              
		
		
		int[] mynum = {10, 20, 30, 40};
		
		   for(int mynumlistvariable :mynum ) {
			   
			System.out.println(mynumlistvariable);
			
		}
		
		
		
		
		
		
		
		
		

	}

}

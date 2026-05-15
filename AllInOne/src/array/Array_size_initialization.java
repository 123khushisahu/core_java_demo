package array;

import java.util.Arrays;

public class Array_size_initialization {

	public static void main(String[] args) {
		
	    String[] varstring= {"vijay","ajay","dinesh"};
	    
	    String var1=varstring[0];
	    String var2=varstring[1];
	    String var3=varstring[2];
	    
	    System.out.println(var1  + "   "+  var2 + "  " + var3);
	    
		
		int[] var=new int[5];
		
		var[0]=1;
		var[1]=2;
		var[2]=3;
		var[3]=4;
		var[4]=5;
		//var[5]=6;
		
		System.out.println(var);
		
		//this is 1 way to print array
		System.out.println(Arrays.toString(var));
		
		
		//this is 2 way to print array
		for (int i : var) {
			System.out.println(i);
			
		}
		
		
		
		
		

	}

}

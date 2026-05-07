package practice;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter day");
     String day = sc.nextLine();
     
     if(day.equals("sunday")) {
    	 System.out.println("sunday");
     }else if(day.equals("monday")) {
    	 System.out.println("monday");
     }else if(day.equals("tuesday")) {
        	 System.out.println("tuesday");
     }else if(day.equals("wednesday")) {
    	 System.out.println("wednesday");
     }else if(day.equals("thursday")) {
    	 System.out.println("thursday");
     }else if(day.equals("friday")) {
    	 System.out.println("friday");
     }else if(day.equals("saturday")){
    	 System.out.println("saturday");
    }else {
    	System.out.println("Enter correct day");
    }
}
}
package novemberprogram;

import java.util.Scanner;
 class StudentMarks {

public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter student name");
	String name=scn.nextLine();
	System.out.println("telagu marks");
	double tm=scn.nextDouble();
	System.out.println("hindi marks");
	double hm=scn.nextDouble();
	System.out.println("english marks");
	double em=scn.nextDouble();
	System.out.println("math marks");
	double mm=scn.nextDouble();
	System.out.println("science marks");
	double sm=scn.nextDouble();
	System.out.println("social marks");
	double som=scn.nextDouble();
	double totalmarks=tm+hm+em+sm+som;
	double percentages=totalmarks/6;
System.out.println("student name:" +name);		
System.out.println("total marks:" +totalmarks);		
System.out.println("Percentage: " + percentages);
		

	}

}

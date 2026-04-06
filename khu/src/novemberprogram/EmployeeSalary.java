	package novemberprogram;
	import java.util.Scanner;
	public class EmployeeSalary {    //read an employee salary and name find total salary of this employee  per anum print all tree value on console
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter  employee name");
		String name=scn.nextLine();
		System.out.println("Enter employee salary:");
		double sal=scn.nextDouble();
		double annual=sal*12;
		System.out.println("employee name" + name);
		System.out.println("employee sal" + sal);
		System.out.println("employee anual sal" + annual);
		
		
		
		
		
			

	}

}

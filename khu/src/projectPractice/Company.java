package projectPractice;
import java.util.Scanner;
public class Company {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	Employee e1=new Employee();
	System.out.print("Enter employee value");
	System.out.print(" eno\t\t: ");
	e1.eno=scn.nextInt();
	System.out.print(" ename\t\t:");
	e1.ename=scn.next();
	System.out.print(" salary\t\t:");
	e1.salary=scn.nextDouble();
	System.out.print(" dept\t\t:");
	e1.dept=scn.next();
	System.out.print(" email\t\t:");
	e1.email=scn.next();
	System.out.print(" mobile\t\t:");
	e1.mobile=scn.nextLong();
	System.out.print(" gender\t\t:");
	e1.gender=scn.next().charAt(0);
	System.out.print(" workingstatus\t\t:");
	e1.workingstatus=scn.nextBoolean();
	System.out.print("you entered values are");
	System.out.println(" eno\t\t         :" +e1.eno);
	System.out.println(" ename\t\t       : "+e1.ename);
	System.out.println("sal\t\t        :" +e1.salary);
	System.out.println("dept\t\t        :" +e1.dept);
	System.out.println(" email\t\t       :" +e1.email);
	System.out.println("mobile\t\t       :" +e1.mobile);
	System.out.println("gender\t\t       :" +e1.gender);
	System.out.println("workingstatus\t:" +e1.workingstatus);
	}

}

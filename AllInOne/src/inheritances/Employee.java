package inheritances;

public class Employee {
	int eno=101;
	String ename="hello";
	Person p=new Person();
	
	public void walk() {
		System.out.println("Employee is walking");
	}
public static void main(String[] args) {
	Employee e=new Employee();
	System.out.println(e.eno);
	System.out.println(e.ename);
	System.out.println(e.p.hands);
	System.out.println(e.p.legs);
	e.walk();
	
}
}

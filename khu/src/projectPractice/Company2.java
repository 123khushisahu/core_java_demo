//develop a project to creat  the rwo employee in pw
package projectPractice;
//company2. java
public class Company2 {

	public static void main(String[] args) {
		// creating to instances for two object hk and bk
		Employee2 e1=new Employee2();
		Employee2 e2=new Employee2();
		//initializing instance with hk value
		e1.eno=202;
		e1.ename="khushisahu";
		e1.dept="java";
		e1.sal=70000;
		//initializing instance with bk value
		e2.eno=202;
		e2.ename="manjudevi";
		e2.dept="python";
		e2.sal=60000;
		
		System.out.println("e1 object value:");
		System.out.println("e1.eno\t:" +e1.eno);
		System.out.println("e1.ename\t:" +e1.ename);
		System.out.println("e1.dept\t:" +e1.dept);
		System.out.println("e1.sal\t:" +e1.sal);
		
		System.out .println("e2 object value:");
		System.out.println("e2.eno\t:" +e2.eno);
		System.out.println("e2.ename\t:" +e2.ename);
		System.out.println("e2.dept\t:" +e2.dept);
		System.out.println("e2.sal\t:" +e2.sal);
		

	}

}

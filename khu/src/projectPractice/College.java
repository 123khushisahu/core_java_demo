package projectPractice;

public class College {

	public static void main(String[] args) {
		//creating 2 instances for the 2 object hk and bk
		Student s1=new Student();
		Student s2=new Student();
		//initializing instance s1 with hk values
		s1.sno=101;
		s1.sname="hk";
		s1.course="java";
		s1.fee=3500;
		//initializing instance s2 with bk values
		s2.sno=102;
		s2.sname="bk";
		s2.course="acting";
		s2.fee=4500;
		System.out.println("S1 OBJECT VALUE:");
		System.out.println("s1.sno\t:" +s1.sno);
		System.out.println("s1.sname\t:" +s1.sname);
		System.out.println("s1.course\t:" +s1.course);
		System.out.println("s1.fee\t:" +s1.fee);
		
		System.out.println("\ns2 object value");
		System.out.println("s2.sno\t:" +s2.sno);
		System.out.println("s2.sname\t:" +s2.sname);
		System.out.println("s2.course\t:" +s2.course);
		System.out.println("s2.fee\t:" +s2.fee);
				
		
	}

}

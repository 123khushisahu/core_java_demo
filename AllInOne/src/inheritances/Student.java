package inheritances;

public class Student extends Person {
	int sno=10;
	String sname="hi";
	public void walk() {
		System.out.println("Student is walking");
	}

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.sno);
		System.out.println(s.sname);
		System.out.println(s.hands);
		System.out.println(s.legs);
		s.walk();

	}

}

package november;

  class Student {

	int sno;
	String sname;
	String course;
	double fee;
	
	}
//college.java
	public  class College{
		
		public static void main(String[]args) {
//			College s1=new College();
//			College s2=new College();
			Student s1=new Student();
			Student s2=new Student();
			s1.sno=101;
			s1.sname="hk";
			s1.course="fsjava";
			s1.fee=3500;
			//initialize s2
			s2.sno=10;
			s2.sname="hM";
			s2.course="fjava";
			s2.fee=3500;
			System.out.println("s2.sno/t:" +s2.sno);
			
		}
	}
	
	




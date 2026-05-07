package encapsulations;

public class SetterGetter {
	private int sno;
	pri
	
	
	vate String sname;
	private double sal;
	public void setsno(int sno) {
		this.sno=sno;
	}
	public int getsno() {
		return sno;
		
	}
	public void setsname(String sname) {
		this.sname=sname;
	}
	public String getsname() {
		return sname;
	}
	
	
	public void setsal(double sal) {
		this.sal=sal;
	}
	public double getsal() {
		return sal;
	}
	public void display() {
		System.out.println("sno:"+sno);
		System.out.println("sname:"+sname);
		System.out.println("sal:"+sal);
		
	}

}

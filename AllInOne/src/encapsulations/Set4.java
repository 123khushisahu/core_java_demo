package encapsulations;

public class Set4 {

	public static void main(String[] args) {
		B e1=new B();
		e1.display();
		e1.setEno(101);
		e1.setEname("hk");
		e1.setsal(1000);
		e1.display();
		e1.setsal(e1.getsal()+e1.getsal()*20/1000);
		System.out.println(e1.getsal());

	}

}



class B{
	private int eno;
	private String ename;
	private double sal;
	public void setsal(double sal) {
		this.sal=sal;
	}
	public double getsal() {
		return sal;
	}
	public void display() {
		System.out.println("ENO:"+eno);
		System.out.println("ename:"+ename);
		System.out.println("sal:"+sal);
	}
}

package encapsulations;

public class setter3 {
	public static void main(String[] args) {
		A ob=new A();
		ob.setsno(101);
		ob.setsname("hk");
		ob.display();
		
	}

}
class A{
	int sno;
	String sname;
	void setsno(int sno) {
		this.sno=sno;
	}
	int getsno() {
		return this.sno;
	}
	void setsname(String sname) {
		this.sname=sname;
	}
	String getsname() {
		return this.sname;
	}
	void display() {
		System.out.println(sno+"======= "+sname);
	}
	
}

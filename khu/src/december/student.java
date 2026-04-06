package december;
public class student {
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
		System.out.println(sno+"---" +sname);
	}
	

}

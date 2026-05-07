//outer class
//private	class C1 {  }
class C2 {  }
//protected class C3 {  }
//public	class C4 {  } //Java file name must be C4.java
public class I {  }

class Test {

	private		class IC1 {	}
				class IC2 {	}
	protected	class IC3 {	}
	public		class IC4 {	}

	private		int a;
				int b;
	protected	int c;
	public		int d;

	//void m1(private int p) {}
	void m1(          int p) {}		//not default, no AM is applied
	//void m1(protected int p) {}
	//void m1(public int p) {}

	void m2() {
		//private	int a;
					int b;			//not default, no AM is applied
		//protected	int c;
		//public	int d;
	}

	private		void m3(){ }
				void m4(){ }	//no modifier means 'default'
	protected	void m5(){ }
	public		void m6(){ }

}
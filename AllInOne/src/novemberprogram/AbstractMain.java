package novemberprogram;

public class AbstractMain extends AbstractTest{

	public static void main(String[] args) {
		
		AbstractMain a=new AbstractMain();
		a.m1();
	}
	@Override
	public void m1() {
		int a =1+2;
		System.out.println(a);
	}
		
	}



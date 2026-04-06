package oops;

public class Demo {
	void max(int a,int b) {
		if(a>b)
		   System.out.println(" a is big:"+a);
		else
			System.out.println("b is big:"+b);
	}
	
	

	public static void main(String[] args) {
		new Demo().max(1, 5);
		//System.out.println(x);
		//Demo d=new Demo();
		//d.max(3,4);
		//System.out.println(z);
		
	}
}

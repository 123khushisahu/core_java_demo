package DSA;

public class class2 {

	public static void main(String[] args) {
		int x=15;
		int y=10;
		int sum=x+y;
		System.out.println(" sum of " + x + " and " + y + " is " + sum);
		
		//xy
		int pro=x*y;
		System.out.println(" product of " + x + " and " + y + " is " +pro);
		//x/y,y/x,x%y
		int v1=x/y;
		int v2=y/x;
		int v3=x%y;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		//exp
		int exp=(x*y)/(x+y);
		System.out.println(exp);
		
		
		int shor=pro/sum;
		System.out.println(shor);
		
		System.out.println();
	}

}

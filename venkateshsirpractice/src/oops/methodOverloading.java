package oops;

public class methodOverloading {
	void max(int a,int b) {
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}
	void max(int a,int b,int c) {
		if((a>b)&&(a>c))
			System.out.println(a);
		else if(b>c)
			System.out.println(b);
		else
			System.out.println(c);
	}

public static void main(String[] args) {
	methodOverloading obj=new methodOverloading();
	obj.max(1,2);
	obj.max(1,2,4);
}
	
}	
package method;

public class Pra {
	static int a=100;
	      
			int x=200;
			void change() {
				a=a+10;
				x=a+20;
			}
			public static void main(String[]args) {
				Pra t1=new Pra(); //for static noneed
				t1.change();  //for access this data
				System.out.println(Pra.a+" "+t1.x);  //it static  can print with class name or reference vari name
			}

}

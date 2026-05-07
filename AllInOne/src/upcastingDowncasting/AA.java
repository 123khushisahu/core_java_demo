package upcastingDowncasting;

public class AA {
	static int a=10;
		int b=20;
}
  class BB extends AA{
	static int a=30;
	static int b=40;
		int x=50;
		int y=60;
		
void m1() {
	System.out.println(this.a+""+super.a);
	System.out.println(this.x+""+super.b);
	System.out.println(this.b+""+this.a);
	System.out.println(super.b+""+super.a);
}

	
}
 class Test{
	public static void main(String[] args){
		BB b1=new BB();
		b1.m1();
		
	}
	 
 }

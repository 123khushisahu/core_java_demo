package upcastingDowncasting;

public class Test09 {
	
	public static void main(String[] args){
		BB1 b1=new BB1();
		b1.m1();
		
	}

}

class AA1 {
	static int a=10;
		int b=20;
}


  class BB1 extends AA1{
	static int a=30;
	static int b=40;
		int x=50;
		int y=60;
		
void m1() {   //this for current cls bb1
	//super for super cls
	System.out.println(this.a+""+super.a);
	System.out.println(this.x+""+super.b);
	System.out.println(this.b+""+this.a);
	System.out.println(super.b+""+super.a);
}
  }

package method;

public class Method4 {
	static int a=100;  //always take updated value
	int x=20;          //always fix value bcz its instance variable
	void change() {
		a=a+x+10;
		x=x+a+20;
	}

	public static void main(String[] args) {
		a=a+1;
		Method4 obj1=new Method4();
		
		
		obj1.change();
		System.out.println(obj1.a+" "+obj1.x);
		Method4 obj2=new Method4();
		obj2.change();
		System.out.println(obj2.a+" "+obj2.x);

		

	}

}

package method;

public class Wish {
	int a;
	int b;
	
 Wish(int a,int b){
this.a=a;
	this.b=b;
    System.out.println("HII");
	}
	
	 void morning() {
		System.out.println("HII GOODMORNING");
	}
	void afternoon() {
		System.out.println("HII GOODAFTERNOON");
	}
	void evening() {
		System.out.println("HII GOODEVENING");
	}

	public static void main(String[] args) {
		Wish obj=new Wish(1,2);
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.morning();
		obj.afternoon();
		obj.evening();
		

	}

}

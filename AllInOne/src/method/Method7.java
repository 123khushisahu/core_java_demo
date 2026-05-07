package method;

public class Method7 {
	static int a=1;   //always take updated value
	int x=2;		// every x place  take 2 because its instance variable
	void change() {
		a=a+x+12;
		x=a+x+12;
		
	}

	public static void main(String[] args) {
    a=a+1;
    Method7 o1=new Method7();
    o1.change();
    System.out.println(o1.a+ " " +o1.x);  
    Method7 o2=new Method7();
    o2.change();
    System.out.println(o2.a+" "+o2.x);
    Method7 o3=new Method7();
    o3.change();
    System.out.println(o3.a+" "+o3.x);
	
	}
}

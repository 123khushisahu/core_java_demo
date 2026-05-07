package method;

public class Constructor {
	
	static int x=10;
	//String name="Khushii";
	String name;
	
	Constructor(){
		System.out.println("zero parameter constructor");
		System.out.println("==========================");
	}
	
	Constructor(int i){
		
		System.out.println("one parameter constructor");
		System.out.println("==========================");
	}
	
	Constructor(String name){
		this.name = name;
	
	}
	void displayName() {
		System.out.println("name of student:"+name);
	}
	
	
	static {
		System.out.println("static block");
		System.out.println("==========================");
	}
	
	{
		System.out.println(" non static block");
		System.out.println("==========================");
	}
	
	
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(1);
		
		System.out.println(Constructor.x);
		System.out.println(c1.x);
		
		
		Constructor c3 = new Constructor("Khushi");
		c3.displayName();
		
		
		
		
	}
}


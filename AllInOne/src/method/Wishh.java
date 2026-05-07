package method;

public class Wishh {
	void Wishh(){
		System.out.println("hii");
	}
	void morning() {
		Wishh();
		
		System.out.println("good morning");
		
	}
	void afternoon() {
		Wishh();
		System.out.println("GOOD AFTERNOON");
	}
	void evening() {
		Wishh();
		
		System.out.println("good evening");
		
	}

	public static void main(String[] args) {
		Wishh obj=new Wishh();
		obj.morning() ;
		obj.afternoon()  ;
		obj.evening() ;

	}

}

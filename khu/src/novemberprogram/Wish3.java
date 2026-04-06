package novemberprogram;

class Wish3 {
	void Wish3(){
		System.out.println("HI");
	}
	String morning() {
		Wish3();
		System.out.println("GOODMORNING");
		return "Hello";
	}
	void afternoon() {
		Wish3();
		System.out.println("GOODafternoon");
	}
   int	 evening() {
	   Wish3();
		System.out.println("GOODevening");
		return 1;
	}
	public static void main (String[]args) {
		Wish3 pramod=new Wish3();
		 String res=pramod.morning();//hello
		 System.out.println(res);
		pramod.afternoon();
		int evn=pramod.evening();
		System.out.println(evn);
	}
	
	
	

}

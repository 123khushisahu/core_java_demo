package december;
class Aaaa {
	static void m1(){ 
		System.out.println("A m1");
	}
}

class Ccc extends Aaaa{
	
//	static void m1(){ 
//		
//		System.out.println("B m1");
//	}
	
	public static void main(String[] args) {
		System.out.println("B main");	
		m1();
	}
}


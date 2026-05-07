package novemberprogram;

public class Demo1 {
	
	public static void main(String[]args) {
		Demo3 d1 = new Demo3();
		System.out.println(d1.id);
		//System.out.println(d1.name);
		System.out.println(d1.college);
		
	}

}

class Demo3{
	private String name="Kushi";
	public int id=10;
	protected String college="apj";
	
	
}

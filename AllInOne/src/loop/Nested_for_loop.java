package loop;

public class Nested_for_loop {

	public static void main(String[] args) {
		
		
		for(int a=10;a>=0;a--) {
			
			System.out.println(a);
			
			for(int i=10;i>=5;i--) {
				System.out.println("nested for loop : " + i);
				
			}
			
		}
	}

}

package december;

public class Khu {

	public static void main(String[] args) {
			int n=12346;
			int max=0;
			

			for(;n>0;n/=10) {
				int digite=n%10;
				
					digite+=digite;
			}
			System.out.println("sum of digit=" +digite);
			
	}

}

package december;

public class Khu {

	public static void main(String[] args) {
			int n=12346;
			int max=0;
			

			for(;n>0;n/=10) {
				int digit=n%10;
				
					digit+=digit;
			}
			System.out.println("sum of digit=" +digit);
			
	}

}

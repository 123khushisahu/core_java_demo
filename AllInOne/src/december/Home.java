package december;

public class Home {

	public static void main(String[] args) {
		int n=569;
		int max=0;
		for(; n>0;n/=10) {
			int digit=n%10;
			if(digit>max) 
				max=digit;
			
		}
			System.out.println("the max num is:"+max);
		
				
		}
	}



package octoberprogram;

public class TwoTypePrint {

	public static void main(String[] args) {
			String[] name= {"hari","mr.vijay"};
			System.out.println("for-loop");
			for(int i=0;i<name.length; i++){
				System.out.println(name[i]);
	}
			System.out.println("for-each-loop");

			for(String a: name ) 
			{
				System.out.println(a);	
			}
	}
	

}

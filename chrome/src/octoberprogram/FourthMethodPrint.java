package octoberprogram;

public class FourthMethodPrint {

	public static void main(String[] args) {
		int[] ai= {1,2,3,4,5};
		//direct print
		{
			System.out.println("int[] ai:"+ai[4]);
		}

		//for-loop
		for(int i=0; i<ai.length; i++) {
			System.out.println(ai[i]);
		}
		//for-each loop
		for( int value:ai) {
		System.out.println( value);
		}
		//using predifined method
		{
			System.out.println(java.util.Arrays.toString(ai));
		}
		
		
	}

}

package octoberprogram;

public class ForAndEachLoop {

	public static void main(String[] args) {
		double[] a= {2.0,3.0};
		System.out.println("for loop");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[1]);
		}
		System.out.println("for-each loop");
		for( double value:a) {
			System.out.println(value);
		}
	}
	

}

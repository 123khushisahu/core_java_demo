package oops;

public class Demo6 {
	public static void main(String[] args) {
		try {		
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		System.out.println(x/y);
		}catch(ArrayIndexOutOfBoundsException ae)
		
		{
			System.out.println("plz pass twoarguments");
		}
		catch(NumberFormatException ne) {
			System.out.println("plz pass two no's only");
		}
		catch(ArithmeticException se) {
			System.err.println("plz pass second argument except zero");
		}

	}
	

}

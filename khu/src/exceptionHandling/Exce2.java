package exceptionHandling;

public class Exce2 {

	public static void main(String[] args) {
		System.out.println("main start");

		//int res1 = 10/0;		//wrong value, here program will be terminated
		//int b   = res1 + 20;	//if not terminated, here wrong result is generated 

		int res2 = 10/2;			//value is changed, no exception
		int b   = res2 + 20;		//here corrected result is generated 

		System.out.println("res: "+ res2);
		System.out.println("b  : "+ b);

		System.out.println("main end");
	}
}


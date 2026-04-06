package p1;

public class ArrtheMatic {
   static void m1() throws NullPointerException{
	    throw new NullPointerException();
	   
   }
   static void m2(int a,int b) {
	   try {
		   int c=a/b;
		   System.out.println(c);
	   }
	   catch (ArithmeticException e) {
		e.printStackTrace();
	}
   }
	public static void main(String[] args) throws ClassNotFoundException {
	   m1();
	   m2(1, 0);
}
}

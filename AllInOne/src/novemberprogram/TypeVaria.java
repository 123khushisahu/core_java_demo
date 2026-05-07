package novemberprogram;

public class TypeVaria {
     int a=10;
     static int  d=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int b=20;
      System.out.println(d);
      TypeVaria vb =new TypeVaria();
      vb.m4(50);
	}
	 public void m1() {
  	   int c =0;
  	   System.out.println(d);
  	   System.out.println(c);
  	   System.out.println(a);
     }
	 public static void m3() {
		  int g=90;
		 // System.out.println(a);
		  System.out.println(g);
	 }
	 public static void m4(int f)
	 {
		 System.out.println("F="+f);
	 }
}

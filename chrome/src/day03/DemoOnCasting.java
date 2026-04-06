package day03;

public class DemoOnCasting {

	public static void main(String[] args) {
		
		//byte  -> short -> int -> long-> float --> double ->
		//    char->
		
		
		byte b1=40; // source value
		short s1=b1;  //destination value
		System.out.println("b1 ="+b1);
		System.out.println("s1 ="+s1);
		
		
		short s2=30800;
		int i1=s2; 
		System.out.println("s2 ="+s2);
		System.out.println("i1 ="+i1);
		
		
		short s3=444;
		long l1=s3;
		System.out.println("s3 ="+s3);
		System.out.println("i1 ="+i1);
		
		
		int i2=896550;
		long l2=i2;
		System.out.println("i3 ="+i2);
		System.out.println("l2 ="+l2);
		
		
		long l3=765894;
		float f1=l3;
		System.out.println("l3 ="+l3);
		System.out.println("f1 ="+f1);
		
		float f2=7650.00f;
		double d1=f2;
		System.out.println("f2 ="+f2);
		System.out.println("d1 ="+d1);
		
		char c='A'; // 1
		int i4=c;  // 4 byte --> 127 renge
		System.out.println("c "+c);
		System.out.println("i4 "+i4);
	}

}

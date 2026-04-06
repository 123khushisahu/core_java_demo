package day02;

public class TypeConvertion {

	public static void main(String[] args) {
		int i=555; //4
		byte b=(byte)i;
		System.out.println(b);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		long l1=i;    //8
		System.out.println(l1);
		
		char c='C';
		int v=c;
		System.out.println(v);
		int v2=91;
		char c2=(char)v2;
		System.out.println(c2);
		
		
		long l2=20;
		int i3=(int)l2;
		
		
		boolean b1=true;
		//int i4=(int)b1;  //not possible
		
		
		
		int i5=97;
		byte b5= (byte)(short)(int)(float)i5;
	}

}

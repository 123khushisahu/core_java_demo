package day03;

public class DemoOnExplicitCasting {
public static void main(String[] args) {
	
	// byte->short->int->long->float->double
	//      char
	
	byte b1=(byte)555;
	System.out.println("b1="+b1);
	
	
	int i=54783;
	short s1=(short)i;
	System.out.println("i="+i);
	System.out.println("s1="+s1);
	
	
	int i1=5478;  // 4 byte
	short s2=(short)i1; // 2 byte
	System.out.println("i1= "+i1);
	System.out.println("s2= "+s2);
	
	
	
	int i2=5674;  // 4
	char c=(char)i2; // 1byte (doubt)
	System.out.println("i2 "+i2);
	System.out.println("c "+c);
	
//	int i4=54783;
//	short s4=(short)i4;                         class cast exception
//	System.out.println("i="+i4);			out of renge 
//	System.out.println("s1="+s4);

///*4lit to 2 lit like something*/0
	
	int i5=5478;  // 4 byte
	short s5=5478; // 2 byte
	System.out.println("i1= "+i5);
	System.out.println("s2= "+s5);
}
}

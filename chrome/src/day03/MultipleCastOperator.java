package day03;

public class MultipleCastOperator {
public static void main(String[] args) {
	double d1=25.00;
	
	//doubl->float->long->int->short->byte->print
	char ch1=(char)d1;
	System.out.println("Double to char: "+ch1);
	
	byte b1=(byte)(short)(int)(long)(char)(float)d1;
	System.out.println("Double d1 "+d1);
	System.out.println("byte b1 "+b1);
}
}

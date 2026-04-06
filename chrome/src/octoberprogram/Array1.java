package octoberprogram;

public class Array1 {

	public static void main(String[] args) {
double[] d1= {1.0,2.0,3.0,4.0,5.0};
System.out.println(d1[0]);
System.out.println(d1[1]);
System.out.println(d1[2]);
System.out.println(d1[3]);
System.out.println(d1[4]);




float[] df1= {1.0f,2.0f,3.0f,4.0f,5.0f,6.0f};
System.out.println(df1[0]);
System.out.println(df1[1]);
System.out.println(df1[2]);
System.out.println(df1[3]);
System.out.println(df1[4]);

System.out.println(df1.length);
System.out.println("for-loop");
for(int i=0;i<df1.length;i++) {
	System.out.println(df1[i]);
	
}
	
System.out.println("for-each");
for(float i: df1) {
	System.out.println(i);
	
}
}
}
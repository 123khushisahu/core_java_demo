package Day6;

public class FibbonaciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c;
		for(int i=1;i<=20;i++)
		{
				c=a+b;
				System.out.println(a);
				a=b;
				b=c;
		}
	}

}

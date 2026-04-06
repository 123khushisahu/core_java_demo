package Day6;

public class Strongno {

	public static void main(String[] args) {
		int a=145;
		int b,c,total=0,temp=a;
		while(a>0)
		{
			b=a%10;
			c=1;
			for(int i=1;i<=b;i++)
			{
				c=c*i;
			}
			total=total+c;
			a=a/10;
		}
		if(total==temp)
			System.out.println("GIVEN NO IS STRONG");
		else
			System.out.println("GIVEN NO IS not STRONG");

	}

}

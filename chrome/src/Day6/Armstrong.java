package Day6;

public class Armstrong {

	public static void main(String[] args) {
int a=154;
int b,total=0,temp=a;
{
	b=a%10;
	total=total+(b*b*b);
	a=a/10;
	
}
if(total==temp) 
	System.out.println("GIVEN NO IS ARMSTRONG NO");

else
	System.out.println("GIVEN NO IS NOT ARMSTRONG NO ");

	
	}

}

package exceptionHandling;

import java.util.Scanner;

public class Addition {
	
	public static void main (String[]args) throws NegativeNumberException {
		
		
		while(true) {
			//Scanner sc = new Scanner(System.in);
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter fno");
				int a =sc.nextInt();
				System.out.println("enter syNO");
				int b= sc.nextInt();
				
				//int a=Integer.parseInt(IO.readln("ENTER FNO:"));
				//int b=Integer.parseInt(IO.readln("ENTER syNO:"));
				
				
				
				int res=Calc.add(a, b);
				System.out.println("Result:"+res);
				Calc.add(a, b);
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("ERROR:"+e.getMessage());
				
			}
			
		}//while close
		
	}

}



//calc.java
class Calc{
	
	static int  add(int a,int b) throws NegativeNumberException {
		if(a<0||b<0) {
			throw new NegativeNumberException("do not pass negattive number:");
		}
		 int c=a+b;
		return c;
		
	}
		}


	


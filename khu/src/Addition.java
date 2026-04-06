import exceptionHandling.NegativeNumberException;

public class Addition {

	public static void main(String[] args) {
		
		while(true) {
			try {
//				int a=Integer.parseInt(IO.readln("ENTER FNO:"));
//				int a=Integer.parseInt(IO.readln("ENTER SNO:"));
				INT RES=Addition.add(a,b);
				System.out.println("RESULT:"+res);
				break;
			}
			catch(NegativeNumberException e) {
				System.out.println("ERROR:pass only integer");
			}
			catch(NegativeNumberException e) {
				System.out.println("ERROR:"+e.getMessage());
			}
		}//while close
	}

}
//aaa
class A11{
	static int add(int a,int b)throws NegativeNumberException{
		if(a<0||b<0) {
			throw new NegativeNumberException("do not pass -ve numbera":)
		}
		int res=a+b;
		return res;
	}
}

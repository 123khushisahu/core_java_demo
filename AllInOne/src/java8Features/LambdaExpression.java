package java8Features;
 interface  Abcde{
	void meth1();
}
public class LambdaExpression {
	public static void main(String[] args) {
		Abcde obj = () -> {
	            System.out.println("Lambda Expression");
	        };
		
		obj.meth1();
	}

}

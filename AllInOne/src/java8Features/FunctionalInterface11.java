package java8Features;
@FunctionalInterface
interface Demo01 {
    void display(int a,int b);
}
public class FunctionalInterface11{
	public static void main(String[] args) {
		Demo01 d=(a,b)->System.out.println("Addition is :" + (a+b));
	
		d.display(10,20);
		
	}

}

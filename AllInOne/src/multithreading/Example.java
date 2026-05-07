package multithreading;
import java.util.Scanner;
public class Example {
	int x;
	int y;
	//public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);

	//}
	{
		x=10;
		System.out.println("hii");
	}
	Example(){
		this.y=20;
		System.out.println("hello");
	}
	Example(int x){
		this.y=16;
		System.out.println("khushi");
	}
	Example(String s){
		y=17;
		System.out.println("sonu");
	}
	Example(double d){
		y=18;
		System.out.println("HOW");
	}
	

}
class Test{
	public static void main(String[]args) {
		Example e1=new Example();
		Example e2=new Example();
		Example e3=new Example();
		Example e4=new Example(12.9);
	}
}

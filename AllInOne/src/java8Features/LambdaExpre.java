package java8Features;

public class LambdaExpre {
	public static void main(String[] args) {

		Demo d = (a,b) -> {

			System.out.println("HELLOOO......");
			return a+b;
		};

		
		int sum = d.add(10,70);
		System.out.println("sum of two num::"+sum);
	}

}

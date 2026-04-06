package december;

public class Sample {

	
		static int a;
		
		static {
			a = 10;	
		}
		
		public static void main(String[] args) {
			System.out.println(a);
			System.out.println(Sample.a);
			
			Sample s1 = new Sample();
			Sample s2 = new Sample();
			
			System.out.println(s1.a);
			System.out.println(s2.a);
			
		}
	}


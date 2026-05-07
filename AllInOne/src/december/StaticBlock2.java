package december;

public class StaticBlock2 {
		
		private static String institute;
		
		static {
			System.out.println("Student is loaded");	
		   	institute = "NiT";
		}
		
		StaticBlock2(){
			System.out.println("Student object is created");
			
		}
		
		public static void setInstitute(String institute) {
			StaticBlock2.institute = institute;	
		}
		
		public static String getInstitute() {
			return institute;	
		}
		
		
		public static void main(String[] args) {

			System.out.println("Main started");

			// Checking default static value
			System.out.println("Default Institute : " + StaticBlock2.getInstitute());

			// Creating object
			StaticBlock2 s1 = new StaticBlock2();

			// Changing institute name
			StaticBlock2.setInstitute("KHUSHI INSTITUTE OF TECHNOLOGY");

			System.out.println("After updating Institute : " + StaticBlock2.getInstitute());
		}
	}


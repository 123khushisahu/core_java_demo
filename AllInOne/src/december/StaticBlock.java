package december;

public class StaticBlock {

			
		
			StaticBlock(){
		    System.out.println("Example NPC");	
		}
			//jvm get static block priority
			static {
				System.out.println("Example SB");	
			}
		
		public static void main(String[] args) {
			System.out.println("Example main");
	        StaticBlock s = new StaticBlock();

		}
	}

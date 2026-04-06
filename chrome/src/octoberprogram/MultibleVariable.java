package octoberprogram;

		class Test05_StoringMulValues {
			public static void main(String[] args) 	{

				int i1 = 3;					//The problems with mulitple variables
				int i2 = 4;						//1. takes more time to read variables
				int i3 = 5;						//    becauase those variables memory
				int i4 = 6;						//    is created in different locations	
				int i5 = 7;					
														
				System.out.println("i1: "+ i1);	//2. code is static nature
				System.out.println("i2: "+ i2); //  because when we need to store more values
				System.out.println("i3: "+ i3);	//  or when we need to remove existing values
				System.out.println("i4: "+ i4);	//  we must modify code every time either 
				System.out.println("i5: "+ i5); //  by adding new variable or by removing
			
	}

}

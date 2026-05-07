package exceptionHandling;

public class Ex02 {		
		public static void main(String[] args) {
			try{
				
				int a = Integer.parseInt(IO.readln("Enter FNO: "));
				int b = Integer.parseInt(IO.readln("Enter SNO: "));
				
				int c = Addition.add(a, b);
				System.out.println("Result: "+ c);
				
			}catch(NumberFormatException e){
				System.out.println("Erro: Enter only integer");	
				
			}catch(IllegalArgumentException e){
				System.out.println("Error: "+ e.getMessage());
				
			}
		}
	}
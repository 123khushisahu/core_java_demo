package practice;

public class ForLoop2 {

	public static void main(String[] args) {
		for(int i = 5; i >= 1; i--){
		    System.out.println(i);
		    //nested loop
		    for(int x = 5; i >= 1; i--){
			    System.out.println(i);
			    
			}  
		}
		int x=0;
		
		while(  x<=5) {
			System.out.println(x);
			x++;
		}
		
		do {   //do-while
			System.out.println(x);
		}while(x==5);

	}

}

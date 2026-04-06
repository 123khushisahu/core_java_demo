package novemberprogram;
//Develop a program to read a number name and they character from the key 
import java.util.Scanner;
public class NumNameChar {

	public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	System.out.println("Enter number:");
	int num= scn.nextInt();
	//scn.nextLine(); from this line work two line
	System.out.println("Enter name:");
	String name=scn.next();
	System.out.println("Enter gender(m/f);");
	char gender=scn.next().charAt(0);
	System.out.println("YOU ENTERED:");
	System.out.println("NUMBER :" +num);
	System.out.println("name:"+name);
	System.out.println("gender:"+gender);
	
	

	}

}

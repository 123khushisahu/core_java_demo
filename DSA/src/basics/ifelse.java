package basics;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks:");
        int marks = sc.nextInt();   // correct input
	if(marks>90) {
		System.out.println("grade A");
		
	}
	else if(marks>75) {
		System.out.println("grade B");
	}else if(marks>60) {
		System.out.println("grade C");
	}else if(marks>45) {
		System.out.println("grade D");
	}else {
		System.out.println("fail");
		}
	}

}

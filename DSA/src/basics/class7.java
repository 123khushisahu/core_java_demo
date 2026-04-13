package basics;

import java.util.Scanner;

public class class7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("!!!ENTER ANY NUMBER!!!");
		int n=Integer.parseInt(sc.nextLine());
		String name=sc.nextLine();
		System.out.println("DEAR "+name+" here is counting");
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

}

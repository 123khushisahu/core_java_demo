//package DSA;
//
//import java.util.Scanner;
//
//public class else_if {
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int a=sc.nextInt();
//	int b=sc.nextInt();
//	if(a==b) {
//		System.out.println("Equals");
//	}else if(a>b) {
//		System.out.println("a is big");
//		}else if(b>a) {
//			System.out.println("b is big");
//	}else {
//		System.out.println("not equal");
//	}
//}
//}



package DSA;

import java.util.Scanner;

public class ElseIf1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equal");

            if(a > b) {
                System.out.println("a is big");
            } else {
                System.out.println("b is big");
            }
        }
    }
}
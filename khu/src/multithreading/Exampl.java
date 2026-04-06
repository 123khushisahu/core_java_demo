package multithreading;

import java.util.Scanner;

public class Exampl {

    public static void main(String[] args) {
        m1();
        m2();
        m3();
    }

    public static void m1() {
        System.out.println("m1 execution start");
        System.out.println("m1 execution end");
    }

    public static void m2() {
        System.out.println("\nm2 execution start");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("m2 execution end");
    }

    public static void m3() {
        System.out.println("\nm3 execution start");
        System.out.println("m3 execution end");
    }
}

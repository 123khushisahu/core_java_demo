package practice;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        while (num != 0) {
            System.out.print("Enter number: ");
            num = sc.nextInt();
        }

        System.out.println("You entered 0. Loop stopped.");
    }
}

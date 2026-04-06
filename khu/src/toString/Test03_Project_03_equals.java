package toString;

import java.util.Scanner;

public class Test03_Project_03_equals {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scn.nextLine();

        System.out.print("Enter password: ");
        String password = scn.nextLine();

        if (username.equalsIgnoreCase("Hari") && password.equals("NiT#123")) {
            System.out.println("Welcome to NiT");
        } else {
            System.out.println("Error: Invalid username or password");
        }

        scn.close();
    }
}

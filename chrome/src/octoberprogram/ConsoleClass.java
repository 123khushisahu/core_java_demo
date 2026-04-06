package octoberprogram;

import java.io.Console;
import java.util.Scanner;

public class ConsoleClass {

	public static void main(String[] args) {

		Console cns = System.console();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = cns.readLine();

		System.out.println("Enter password: ");
		String password = cns.readLine();
		System.out.println("You Enter: ");
		System.out.println("username:  " + username);
		System.out.println("password:  " + password);

	}

}

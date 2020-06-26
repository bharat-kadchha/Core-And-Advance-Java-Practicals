package iopackage;

import java.io.Console;
import java.util.Arrays;

public class ConsoleDemo {

	public static void main(String[] args) {

		// Console supplies no constructors. Instead, a Console object is obtained by
		// calling System.console( )
		Console con = System.console();
		if (con == null) {
			System.out.print("No console available");
			return;
		}

		// Read a string and then display it.
		String s = con.readLine("Enter your name: ");
		con.printf("Here is your name: %s\n", s);

		System.out.println("Enter the password: ");
		char[] ch = con.readPassword();
		System.out.println("Password is: " + Arrays.asList(ch));

	}
}

package userinput;

import java.io.Console;

public class ReadPassword {

	public static void main(String args[]) {
		String str;

		// Obtaining a reference to the console.
		Console con = System.console();

		// Checking If there is no console available, then exit.
		if (con == null) {
			System.out.print("No console available");
			return;
		}

		str = con.readLine("Enter your name: ");
		con.printf("Here is your name: %s\n", str);

		System.out.println("Enter the password: ");
		char[] ch = con.readPassword();

		String pass = String.valueOf(ch);
		System.out.println("Password is: " + pass);
	}
}

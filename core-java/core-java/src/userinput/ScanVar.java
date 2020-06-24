package userinput;

import java.util.Scanner;

public class ScanVar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter int value");
		int a = input.nextInt();
		System.out.println("enter int value=" + a);

		System.out.println("enter String value");
		String string = input.next();
		System.out.println("enter String value=" + string);

		System.out.println("enter long value");
		long longValue = input.nextLong(2);
		System.out.println("enter long value=" + longValue);

		System.out.println("enter char value");

		char charValue = input.next().charAt(2);
		System.out.println("char value=" + charValue);

		input.close();

	}

}

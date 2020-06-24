package leb_1;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("enter int value");
		int a = input.nextInt();

		System.out.println("enter float value");
		float floatValue = input.nextFloat();

		System.out.println("enter String value");
		String stringValue = input.next();

		System.out.println("enter byte value");
		byte byteValue = input.nextByte();

		System.out.println("enter long value");
		long longValue = input.nextLong();

		System.out.println("enter char value");

		char charValue = input.next().charAt(2);

		System.out.println(" int value=" + a);
		System.out.println(" String value=" + stringValue);
		System.out.println(" long value=" + longValue);
		System.out.println("char value=" + charValue);
		System.out.println("float value=" + floatValue);
		System.out.println("byte value=" + byteValue);

		input.close();

	}

}

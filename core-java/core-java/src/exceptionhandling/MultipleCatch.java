package exceptionhandling;

import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {

		System.out.println("enter a value");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		scanner.close();
		try {
			System.out.println("23/" + value + " == " + 23 / value);
			try {

				int array[] = { 1, 2 };
				array[5] = 20;
			} catch (ArithmeticException e) {

				System.out.println("Array out of bound");
			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("bound array");
			}
		} catch (ArithmeticException e) {

			System.out.println("divide by 0 not possible");
		}
		System.out.println("try/catch block completed");

	}

}

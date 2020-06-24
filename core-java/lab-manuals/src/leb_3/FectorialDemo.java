package leb_3;

import java.util.Scanner;

public class FectorialDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter no=");
		int input = scanner.nextInt();
		scanner.close();
		int result = fect(input);
		System.out.println("fectorial =" + result);
	}

	static int fect(int input) {
		if (input == 0 || input == 1) {
			return 1;
		} else {
			return input * fect(input - 1);
		}
	}
}

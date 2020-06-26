package basic_programs;

import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) {
		System.out.println("enter range of prime number :");
		Scanner input = new Scanner(System.in);

		int range = input.nextInt();
		input.close();
		for (int i = 2; i <= range; i++) {
			int flg = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flg = 1;
					break;
				}
			}

			if (flg == 0)
				System.out.println(i + " is prime");
		}

	}

}

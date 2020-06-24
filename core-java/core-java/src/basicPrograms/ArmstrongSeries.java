package basicPrograms;

import java.util.Scanner;

public class ArmstrongSeries {

	public static void main(String[] args) {

		System.out.println("enter renge for armstrong no :");
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();
		int rem, result = 0;

		for (int i = 1; i < range; i++) {
			int org = i;
			while (org != 0) {
				rem = org % 10;
				result += rem * rem * rem;
				org = org / 10;
			}
			if (i == result) {
				System.out.println(i);
			}
			result = 0;
		}
		input.close();

	}

}

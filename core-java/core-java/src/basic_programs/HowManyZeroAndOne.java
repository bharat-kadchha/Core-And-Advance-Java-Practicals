package basic_programs;

import java.util.Scanner;

public class HowManyZeroAndOne {

	public static void main(String[] args) {
		int noOfZero = 0, noOfOnes = 0;

		int[] a = new int[4];

		Scanner s1 = new Scanner(System.in);
		System.out.println("enter only 0 and 1");

		for (int i = 0; i < a.length; i++) {
			a[i] = s1.nextInt();
		}
		s1.close();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				noOfZero++;

			} else if (a[i] == 1) {
				noOfOnes++;
			}

		}
		System.out.println("no of zero =" + noOfZero);
		System.out.println("no of one =" + noOfOnes);

	}

}

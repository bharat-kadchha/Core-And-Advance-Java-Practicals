package basic_programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number for palindrome or not :");
		
		int a = input.nextInt();
		input.close();
		int rvs = 0, rem, org;
		org = a;
		while (a != 0) {
			rem = a % 10;
			rvs = rvs * 10 + rem;
			a = a / 10;

		}
		if (org == rvs)
			System.out.println(org + " is a palindrome");
		else
			System.out.println(org + " is not a palindrome");

	}

}

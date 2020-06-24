package assertion;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		assert num > 20 : "out of range";

		System.out.println(num);

	}
}

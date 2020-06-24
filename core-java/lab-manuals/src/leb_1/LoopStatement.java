package leb_1;

import java.util.Scanner;

public class LoopStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int status;
		do {
			System.out.println("select loops to be performed");

			System.out.println("1 if else\n2 for_loop \n");
			int ch = scanner.nextInt();

			switch (ch) {
			case 1:
				System.out.println("enter i=");
				
				int i = scanner.nextInt();
				
				System.out.println("enter j=");
				int j = scanner.nextInt();
				
				if (i > j)
					System.out.println("maximum " + i);
				else
					System.out.println("maximum " + j);
				break;
			case 2:
				for (int l = 0; l < 10; l++) {
					System.out.print("" + l);
				}
				break;

			default:
				System.out.println("invalid choice");
				break;
			}
			System.out.println("do you want to continue");
			status = scanner.nextInt();

		} while (status == 1);

		scanner.close();
	}

}

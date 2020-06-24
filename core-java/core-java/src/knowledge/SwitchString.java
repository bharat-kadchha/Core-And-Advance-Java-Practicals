package knowledge;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {

		System.out.println("enter day in three letter : ");
		Scanner sc = new Scanner(System.in);
		String day = sc.next();

		// switch with string concept in JDK 7.
		switch (day) {
		case "mon":
			System.out.println("frist day of week");
			break;
		case "thu":
			System.out.println("second day of week");
			break;
		case "web":
			System.out.println("third day of week");
			break;
		case "ths":
			System.out.println("fourth day of week");
			break;
		case "fri":
			System.out.println("fifth day of week");
			break;
		case "sat":
			System.out.println("sixth day of week");
			break;
		default:
			System.out.println("seventh day of week");
			break;
		}

	}
}

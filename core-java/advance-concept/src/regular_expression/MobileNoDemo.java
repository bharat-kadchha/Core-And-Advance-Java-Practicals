package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoDemo {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[7-9][0-9]{9}");
		System.out.println("enter mobile no ");
		
		Scanner scanner = new Scanner(System.in);
		
		String s1 = scanner.next();
		scanner.close();
		
		Matcher matcher = pattern.matcher(s1);
		if (matcher.find() && matcher.group().equals(s1)) {

			System.out.println("yes valid");
		} else {
			System.out.println("invalid");
		}
	}

}

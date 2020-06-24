package leb_3;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {

		String string = "hello world";
		StringTokenizer stringTokenizer = new StringTokenizer(string);

		System.out.println(stringTokenizer.countTokens());
		while (stringTokenizer.hasMoreElements()) {
			System.out.println(stringTokenizer.nextToken());

		}
	}
}

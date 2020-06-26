package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("[^a-z0-9A_Z]");
		Matcher matcher = pattern.matcher("adsc132@#2153.0");
		while (matcher.find()) {
			System.out.println(matcher.start() + "..." + matcher.end() + "..." + matcher.group());
		}
	}

}

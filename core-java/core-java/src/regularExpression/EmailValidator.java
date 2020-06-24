package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

	private static Pattern pattern;

	private Matcher matcher;

	public boolean validateEmail(String email) {
		// initialize the Pattern object
		matcher = pattern.matcher(email);
		return matcher.matches();

	}
}

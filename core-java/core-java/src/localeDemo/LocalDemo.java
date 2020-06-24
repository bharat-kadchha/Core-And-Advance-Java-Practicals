package localeDemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {

	public static void main(String[] args) {

		Locale locale = Locale.getDefault();

		System.out.println(locale.getDisplayLanguage());

		Locale locale2 = new Locale("it", "IT");
		System.out.println(locale2.getDisplayName());

		ResourceBundle bundle = ResourceBundle.getBundle("message", locale2);

		System.out.println(bundle.getString("start"));

		Locale locale3 = new Locale("en", "USA");

		bundle = ResourceBundle.getBundle("message", locale3);

		System.out.println(bundle.getString("end"));

	}

}

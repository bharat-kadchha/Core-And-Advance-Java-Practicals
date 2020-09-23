package reading_email_using_pop;

import java.util.Properties;

import javax.mail.Session;
import javax.mail.Store;

public class Pop3configuration {

	public static Store configure() {
		Properties properties = new Properties();

		properties.put("mail.pop3.host", "pop.gmail.com");
		properties.put("mail.pop3.port", "995");
		properties.put("mail.pop3.starttls.enable", "true");

		final String user = "userMail@gmail.com";
		final String password = "******";
		try {

			Session session = Session.getDefaultInstance(properties);
			Store store = session.getStore("pop3s");
			store.connect("pop.gmail.com", user, password);

			return store;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

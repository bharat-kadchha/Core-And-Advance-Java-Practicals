package reading_email_using_imap;

import java.util.Properties;

import javax.mail.Session;
import javax.mail.Store;

public class ImapConfiguration {

	public static Store configure() {
		try {
			Properties props = System.getProperties();
			props.setProperty("mail.store.protocol", "imaps");

			final String user = "userMail@gmail.com";
			final String password = "*********";
			Session session = Session.getDefaultInstance(props, null);
			Store store = session.getStore("imaps");
			store.connect("imap.gmail.com", user, password);
			return store;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}
}

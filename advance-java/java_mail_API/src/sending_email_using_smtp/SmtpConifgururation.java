package sending_email_using_smtp;

import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class SmtpConifgururation {

	public static Session configure() {

		final String from = "userMail@gmail.com";
		final String password = "*********";

		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.port", "587");

		return Session.getInstance(prop, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

	}
}

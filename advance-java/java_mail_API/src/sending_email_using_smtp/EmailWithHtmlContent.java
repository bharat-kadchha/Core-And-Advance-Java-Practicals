package sending_email_using_smtp;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailWithHtmlContent {
	public static void main(String[] args) {
		try {
			String to = "reciverMail@gmail.com";

			MimeMessage message = new MimeMessage(SmtpConifgururation.configure());
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("regarding practice for java");
			message.setContent("<p>click on bellow button. </p>"
					+ "<button type=\"button\" onclick=\"alert('Hello world!')\">Click Me!</button>\r\n","text/html");

			// send message
			Transport.send(message);
			System.out.println("message sent successfully");

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}
}

package sending_email_using_smtp;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailWithPlainText {
	public static void main(String[] args) {

		sendText("mail testing", "this is plain message where you  find only text");

	}

	public static void sendText(String sub, String msg) {

		final String to = "reciverMail@gmail.com";
		try {
			MimeMessage message = new MimeMessage(SmtpConifgururation.configure());
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(sub);
			message.setText(msg);

			Transport.send(message);

			System.out.println("message sent successfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

}

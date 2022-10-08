package sending_email_using_smtp;

import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailTOMultipleRecipients {

	public static void main(String[] args) {

		sendToAll("this is bulk email to all.", "firstRecipient@gmail.com,secondRecipient@gmail.com");
	}
	public static void sendToAll(String subject, String to) {

		try {
			MimeMessage message = new MimeMessage(SmtpConifgururation.configure());
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(subject);
			message.setText("Hi, Bharat Good Mornning \n Welcome to the Team");

			Transport.send(message);
			System.out.println("mail send to all Recipients");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}

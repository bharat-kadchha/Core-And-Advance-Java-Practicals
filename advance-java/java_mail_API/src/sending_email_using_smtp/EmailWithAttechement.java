package sending_email_using_smtp;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

public class EmailWithAttechement {

	public static void main(String[] args) {

		final String to = "reciverMail@gmail.com";
		try {
			MimeMessage message = new MimeMessage(SmtpConifgururation.configure());
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("you document");
			message.setSentDate(new Date());

			File myFile = new File("mail.txt");
			if (!myFile.exists()) {
				putData(myFile);
			}

			BodyPart bodyPart1 = new MimeBodyPart();
			String data = "below attechment is your time table";
			bodyPart1.setText(data);
			bodyPart1.setContent("<h1>" + data + "</h1>", "text/html");

			DataSource source = new FileDataSource(myFile);

			MimeBodyPart mimeBody = new MimeBodyPart();

			mimeBody.setDataHandler(new DataHandler(source));
			mimeBody.setFileName(myFile.getName());

			Multipart multipart = new javax.mail.internet.MimeMultipart();
			multipart.addBodyPart(bodyPart1);
			multipart.addBodyPart(mimeBody);

			message.setContent(multipart);

			Transport.send(message);
			System.out.println("mail send with attechement");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void putData(File myFile) {
		try {
			myFile.createNewFile();
			FileWriter writer = new FileWriter(myFile);
			String msg = "this message ...your ids is secre is \'!#DFE@SF#@\' and password is \'123456\'";
			writer.write(msg);
			writer.close();
		} catch (Exception e) {

		}
	}

}

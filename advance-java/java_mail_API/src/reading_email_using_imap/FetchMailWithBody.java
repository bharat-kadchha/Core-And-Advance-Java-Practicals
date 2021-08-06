package reading_email_using_imap;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;

import javax.mail.Address;
import javax.mail.Flags;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Store;
import javax.mail.search.FlagTerm;

public class FetchMailWithBody {

	public static void main(String[] args) {

		try {
			Store store = ImapConfiguration.configure();
			Folder folder = store.getFolder("INBOX");
			folder.open(Folder.READ_ONLY);

			// IMAP support Flags // SEEN , DRAFT , RECENT etc..
			Message[] messages = folder.search(new FlagTerm(new Flags(Flag.SEEN), false));

			Arrays.sort(messages, (m1, m2) -> {
				try {
					return m2.getSentDate().compareTo(m1.getSentDate());
				} catch (MessagingException e) {
					throw new RuntimeException(e);
				}
			});

			Message recentMessage = messages[0];

			System.err.println("-------Email details--------");
			writeData(recentMessage);

			System.err.println("----------------------------");

			folder.close();
			store.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void writeData(Part part) throws MessagingException {
		if (part instanceof Message) {
			writeEnvlope((Message) part);
		}
		try {
			System.out.println("######################");
			System.out.println("CONTENT-TYPE: " + part.getContentType());

			if (part.isMimeType("text/plain")) {

				System.out.println("This is plain text");
				System.out.println("---------------------------");
				System.out.println((String) part.getContent());

			} else if (part.isMimeType("multipart/*")) {

				System.out.println("This is a Multipart");
				System.out.println("---------------------------");
				Multipart mp = (Multipart) part.getContent();
				int count = mp.getCount();
				for (int i = 0; i < count; i++) {
					writeData(part);
				}

			} else if (part.isMimeType("image/jpeg")) {
				System.out.println("This is a image/jpeg");

				InputStream input = (InputStream) part.getContent();
				FileOutputStream file = new FileOutputStream("temp/image.jpeg");
				System.err.println("length : " + input.available());
				byte[] data = new byte[input.available()];
				int read;
				while ((read = input.read(data)) != -1) {
					file.write(data, 0, read);
					input.close();
					file.close();
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void writeEnvlope(Message msg) throws MessagingException {
		System.out.println("This is the message envelope");
		System.out.println("---------------------------");
		Address[] a;

		// FROM
		if ((a = msg.getFrom()) != null) {
			for (int j = 0; j < a.length; j++)
				System.out.println("FROM: " + a[j].toString());
		}

		// TO
		if ((a = msg.getRecipients(Message.RecipientType.TO)) != null) {
			for (int j = 0; j < a.length; j++)
				System.out.println("TO: " + a[j].toString());
		}

		// SUBJECT
		if (msg.getSubject() != null)
			System.out.println("SUBJECT: " + msg.getSubject());

	}

}

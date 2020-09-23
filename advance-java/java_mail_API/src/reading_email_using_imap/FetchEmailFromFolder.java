package reading_email_using_imap;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Store;

public class FetchEmailFromFolder {

	public static void main(String[] args) {
		try {
			Store store = ImapConfiguration.configure();
			Folder folder = store.getFolder("INBOX");
			folder.open(Folder.READ_WRITE);
			Message[] messages = folder.getMessages();

			// The messages are in the order received.
			for (int i = 0; i < 10; i++) {
				System.out.println("---------------------------------");
				System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + messages[i].getSubject());
				System.out.println("From: " + messages[i].getFrom()[0]);
				System.out.println("send Date: " + messages[i].getSentDate());
				System.out.println("size: " + messages[i].getSize());
				System.out.println("Flag: " + messages[i].getFlags());
			}
			folder.close();
			store.close();

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}

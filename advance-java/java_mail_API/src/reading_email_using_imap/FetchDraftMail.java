package reading_email_using_imap;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Store;

public class FetchDraftMail {
	public static void main(String[] args) {

		try {
			Store store = ImapConfiguration.configure();
			Folder folder = store.getFolder("[Gmail]/Drafts");
			folder.open(Folder.READ_ONLY);

			Message[] messages = folder.getMessages();

			for (int i = 0; i < 5; i++) {
				System.out.println("---------------------------------");
				System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + messages[i].getSubject());
				System.out.println("From: " + messages[i].getFrom()[0]);

			}
			folder.close();
			store.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}

package reading_email_using_imap;

import javax.mail.Flags;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Store;
import javax.mail.search.FlagTerm;

public class FetchEmailByFlags {

	public static void main(String[] args) {

		try {
			Store store = ImapConfiguration.configure();
			Folder folder = store.getFolder("INBOX");
			folder.open(Folder.READ_ONLY);

			// IMAP support Flags // SEEN , DRAFT , RECENT etc..
			Message[] messages = folder.search(new FlagTerm(new Flags(Flag.SEEN), true));

			for (int i = 0; i < 10; i++) {
				System.out.println("---------------------------------");
				System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + messages[i].getSubject());
				System.out.println("From: " + messages[i].getFrom()[0]);
				System.out.println("send Date: " + messages[i].getSentDate());

				// after read message you can set flag as seen like...
				// messages[i].setFlag(Flag.SEEN,true);

			}
			folder.close();
			store.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}

package reading_email_using_pop;

import javax.mail.Flags;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Store;
import javax.mail.search.FlagTerm;

public class FetchEmailByFlages {
	public static void main(String[] args) {

		try {
			Store store = Pop3configuration.configure();
			Folder folder = store.getFolder("INBOX");
			folder.open(Folder.READ_WRITE);

			// POP3 not support Flags
			Message[] messages = folder.search(new FlagTerm(new Flags(Flag.RECENT), true));

			for (int i = 0; i < 10; i++) {
				System.out.println("---------------------------------");
				System.out.println("Email Number " + (i + 1));
				System.out.println("Subject: " + messages[i].getSubject());
				System.out.println("From: " + messages[i].getFrom()[0]);
				System.out.println("send Date: " + messages[i].getSentDate());

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}

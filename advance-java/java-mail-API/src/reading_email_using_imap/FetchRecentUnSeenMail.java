package reading_email_using_imap;

import java.util.Arrays;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Store;
import javax.mail.Flags.Flag;
import javax.mail.search.FlagTerm;

public class FetchRecentUnSeenMail {

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

			for (int i = 0; i < 3; i++) {
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

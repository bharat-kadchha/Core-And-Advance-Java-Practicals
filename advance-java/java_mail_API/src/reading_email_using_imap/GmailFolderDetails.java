package reading_email_using_imap;

import javax.mail.Folder;
import javax.mail.Store;

public class GmailFolderDetails {
	public static void main(String[] args) {

		try {
			Store store = ImapConfiguration.configure();

			Folder[] folders = store.getDefaultFolder().list("*");

			System.out.println("folder list :");
			for (Folder f : folders) {

				System.err.println("fullname :" + f.getFullName());

			}
			store.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}

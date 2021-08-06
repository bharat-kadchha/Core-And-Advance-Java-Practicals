package reading_email_using_pop;

import javax.mail.Folder;
import javax.mail.Store;

public class GmailFolderDetails {

	public static void main(String[] args) {

		try {
			Store store = Pop3configuration.configure();

			Folder[] folders = store.getDefaultFolder().list();
			System.out.println("folder list :");
			for (Folder f : folders) {

				f.open(Folder.READ_WRITE);

				System.err.println("mode :" + f.getMode());
				System.err.println("name :" + f.getName());
				System.err.println("fullname :" + f.getFullName());
				System.err.println("message count :" + f.getMessageCount());
				System.err.println("new message count :" + f.getNewMessageCount());
				System.err.println("deleted message count :" + f.getDeletedMessageCount());
				System.err.println("unread message count :" + f.getUnreadMessageCount());
				System.err.println("Url name :" + f.getURLName());

			}

			store.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}

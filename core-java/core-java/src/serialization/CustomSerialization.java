package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	String username = "rahul";
	transient String pwd = "rahul123";
	transient int pin = 5432;

	private void writeObject(ObjectOutputStream outStream) throws IOException {
		outStream.defaultWriteObject();
		String epwd = "@#$" + pwd;
		outStream.writeObject(epwd);

		int epin = (pin / 2) + 1;
		outStream.writeInt(epin);
	}

	private void readObject(ObjectInputStream inStream) throws IOException, ClassNotFoundException {
		inStream.defaultReadObject();
		String epwd = (String) inStream.readObject();
		pwd = epwd.substring(3);

		int epin = inStream.readInt();
		pin = (epin - 1) * 2;

	}

}

public class CustomSerialization {
	public static void main(String[] args) throws Exception {

		Account account = new Account();

		System.out.println(account.username + "..." + account.pwd + ".." + account.pin);
		FileOutputStream fo = new FileOutputStream("src/pass.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(account);
		oo.close();
		fo.close();

		FileInputStream fi = new FileInputStream("src/pass.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Account account2 = (Account) oi.readObject();
		System.out.println(account2.username + "..." + account2.pwd + "..." + account2.pin);

		oi.close();
		fi.close();

	}

}

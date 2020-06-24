package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sender {
	public static void main(String[] args) throws IOException {
		MyAccount m = new MyAccount();

		FileOutputStream fos = new FileOutputStream("src/UID.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(m);
		System.out.println(m.i + m.s);
		oos.close();

	}

}

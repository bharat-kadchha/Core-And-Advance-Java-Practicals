package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable {
	int i = 10;
	// transient ==not to be serialize

	transient static int j = 20; // static and final also

}

public class TransientKeyword {
	public static void main(String[] args) throws Exception {

		Test test = new Test();
		System.out.println(test.i + "..." + test.j);
		// serialization
		FileOutputStream fos = new FileOutputStream("src/sys.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(test);

		oos.close();

		// deserialization
		FileInputStream fis = new FileInputStream("src/sys.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Test d2 = (Test) ois.readObject();

		System.out.println(d2.i + "..." + d2.j);

		ois.close();

	}

}

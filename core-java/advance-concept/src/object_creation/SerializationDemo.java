package object_creation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name = "object created..";

	public static void main(String[] args) {

		SerializationDemo ds = new SerializationDemo();

		try {

			// First serialize object in to file
			FileOutputStream fis = new FileOutputStream("src/serialize.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(ds);
			oos.close();
			fis.close();

			// deserialize object from file

			FileInputStream fis1 = new FileInputStream("src/serialize.txt");
			ObjectInputStream ois = new ObjectInputStream(fis1);
			SerializationDemo sobj = (SerializationDemo) ois.readObject();
			System.out.println(sobj.name);

			fis1.close();
			ois.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

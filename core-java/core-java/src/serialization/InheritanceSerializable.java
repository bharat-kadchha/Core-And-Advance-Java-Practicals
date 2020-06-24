package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {

	private static final long serialVersionUID = 1L; // default
	public int i = 10;
}

class Lion extends Animal {

	private static final long serialVersionUID = 890283533356783567L; // generated
	int j = 20;
}

public class InheritanceSerializable {
	public static void main(String[] args) throws Exception {

		Lion d = new Lion();
		// System.out.println(d.i+"..."+d.j);

		// serialization
		FileOutputStream fo = new FileOutputStream("src/demo.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(d);
		fo.close();
		oo.close();

		// diserialization
		FileInputStream fi = new FileInputStream("src/demo.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);

		Lion d2 = (Lion) oi.readObject();

		System.out.println(d2.i + "..." + d2.j);

		fi.close();
		oi.close();

	}

}

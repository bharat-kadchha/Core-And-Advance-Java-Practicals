package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Apple implements Externalizable {
	String s;
	int i, j;

	public Apple() {
		System.out.println("public costractor");
	}

	Apple(String s, int i, int j) {
		this.s = s;
		this.i = i;
		this.j = j;
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s = (String) in.readObject();
		i = in.readInt();

	}

	public void writeExternal(ObjectOutput o) throws IOException {
		o.writeObject(s);
		o.writeInt(i);
	}
}

public class Externlizationdemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Apple a = new Apple("bharat", 12, 13);

		FileOutputStream fo = new FileOutputStream("src/externalizable.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(a);

		fo.close();
		oo.close();

		System.out.println(a.s + "..." + a.i + "..." + a.j);
		FileInputStream fi = new FileInputStream("src/externalizable.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);

		Apple a1 = (Apple) oi.readObject();

		System.out.println(a1.s + "..." + a1.i + "..." + a1.j);

		fi.close();
		oi.close();
	}

}

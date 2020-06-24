package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent {
	int i = 10;

}

class Son extends Parent implements Serializable {
	private static final long serialVersionUID = 1L;
	int j = 20;
}

public class InheritanceSerialization2 {

	public static void main(String[] args) throws Exception {

		Son son = new Son();
		son.i = 100;
		son.j = 200;

		FileOutputStream fo = new FileOutputStream("src/man.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		System.out.println("serialization =" + son.i + "..." + son.j);
		oo.writeObject(son);

		oo.close();

		FileInputStream fi = new FileInputStream("src/man.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Son son1 = (Son) oi.readObject();

		System.out.println("deserialization =" + son1.i + "..." + son1.j);
		oi.close();
	}
}

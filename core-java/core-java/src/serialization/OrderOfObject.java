package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Man implements Serializable {
	String m = "it is man ";
}

@SuppressWarnings("serial")
class Cat implements Serializable {
	String c = "it is cat ";

}

@SuppressWarnings("serial")
class Rat implements Serializable {
	String r = "it is rat ";
}

public class OrderOfObject {

	public static void main(String[] args) throws Exception {

		Man man = new Man();
		Cat cat = new Cat();
		Rat rat = new Rat();

		FileOutputStream fo = new FileOutputStream("src/sys.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);

		oo.writeObject(man);
		oo.writeObject(cat);
		oo.writeObject(rat);

		fo.close();
		oo.close();

		FileInputStream fi = new FileInputStream("src/sys.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);

		Man m1 = (Man) oi.readObject();
		Cat c1 = (Cat) oi.readObject();
		Rat r1 = (Rat) oi.readObject();

		System.out.println("man ..." + m1.m);
		System.out.println("cat ..." + c1.c);
		System.out.println("rat ..." + r1.r);

		fi.close();
		oi.close();

	}
}

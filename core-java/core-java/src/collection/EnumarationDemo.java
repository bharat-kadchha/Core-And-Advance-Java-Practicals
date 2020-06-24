package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo {

	public static void main(String[] args) {

		Vector<String> vec = new Vector<String>();
		vec.add("123");
		vec.add("abc");
		vec.addElement("xyz");
		vec.addElement("xyz");
		System.out.println(vec);
		Enumeration<String> enum1 = vec.elements();

		while (enum1.hasMoreElements()) {

			System.out.println(enum1.nextElement());
		}

	}
}

package leb_3;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> vactor = new Vector<String>();
		System.out.println(vactor.capacity());

		vactor.add("123");
		vactor.add("abc");
		vactor.addElement("xyz");
		vactor.addElement("xyz");
		System.out.println(vactor);
		System.out.println(vactor.size());
		vactor.remove(1);
		vactor.remove("xyz");
		System.out.println(vactor);
		System.out.println(vactor.get(1));
		vactor.add("12.2");
		vactor.add(null);
		System.out.println(vactor.elementAt(2));
		System.out.println(vactor);
		System.out.println(vactor.firstElement());
		System.out.println(vactor.lastElement());
	}
}

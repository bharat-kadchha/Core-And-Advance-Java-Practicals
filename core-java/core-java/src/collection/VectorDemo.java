package collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		
		Vector<String> vector=new Vector<String>();
		System.out.println(vector.capacity());
		
		vector.add("123");
		vector.add("abc");
		vector.addElement("xyz");
		vector.addElement("xyz");
		
		System.out.println(vector);
		System.out.println(vector.size());
		
		vector.remove(1);
		vector.remove("xyz");
		
		System.out.println(vector);
		System.out.println(vector.get(1));
		
		vector.add("12.2");
		vector.add(null);
		
		System.out.println(vector.elementAt(2));
		System.out.println(vector);
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
	}
}

package collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {

		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(101, "ravi");
		hashTable.put(102, "harsh");
		hashTable.put(103, "keyur");
		hashTable.put(104, "rajesh");
		hashTable.put(102, "vijay");
		System.out.println(hashTable);
		System.out.println("empty =" + hashTable.isEmpty());

		System.out.println("table data");

		Enumeration<Integer> entry = hashTable.keys();
		while (entry.hasMoreElements()) {
			System.out.println(entry.nextElement());
		}
	}

}

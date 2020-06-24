package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(101, "ravi");
		hashMap.put(102, "parsh");
		hashMap.put(103, "keyur");
		hashMap.put(104, "rajesh");
		hashMap.put(102, "vijay");

		System.out.println(hashMap);
		System.out.println(hashMap.put(100, "ravi"));
		System.out.println(hashMap);
		System.out.println("key set " + hashMap.keySet());
		System.out.println("value set " + hashMap.values());
		
		Set<Entry<Integer, String>> s = hashMap.entrySet();
		System.out.println("entry set " + s);

		Iterator<Entry<Integer, String>> i = s.iterator();

		while (i.hasNext()) {
			Entry<Integer, String> entry = i.next();
			System.out.println(entry.getKey() + ".." + entry.getValue());
		}

	}

}

package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
		hashMap.put(101, "ravi");
		hashMap.put(102, "harsh");
		hashMap.put(103, "keyur");
		hashMap.put(104, "rajesh");
		hashMap.put(102, "vijay");

		System.out.println(hashMap);
		System.out.println(hashMap.put(101, "happy"));
		System.out.println(hashMap);
		System.out.println("key set " + hashMap.keySet());
		System.out.println("value set " + hashMap.values());
		
		Set<Entry<Integer, String>> set = hashMap.entrySet();
		System.out.println("entry set " + set);

		Iterator<Entry<Integer, String>> item = set.iterator();

		while (item.hasNext()) {
			Entry<Integer, String> entry = item.next();
			System.out.println(entry.getKey() + ".." + entry.getValue());
		}
	}

}

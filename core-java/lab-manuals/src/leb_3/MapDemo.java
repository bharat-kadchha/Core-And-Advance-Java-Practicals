package leb_3;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(101, "ravi");
		hashMap.put(102, "harsh");
		hashMap.put(103, "keyur");
		hashMap.put(104, "rajesh");
		hashMap.put(102, "vijay");

		System.out.println(hashMap);
		System.out.println(hashMap.put(100, "ravi"));
		System.out.println(hashMap);
		System.out.println("key set " + hashMap.keySet());
		System.out.println("value set " + hashMap.values());
		Set<?> entrySet = hashMap.entrySet();
		System.out.println("entry set " + entrySet);

		Iterator<?> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.println(mapEntry.getKey() + ".." + mapEntry.getValue());
		}

		LinkedHashMap<Integer, String> h2 = new LinkedHashMap<Integer, String>();
		h2.put(101, "ravi");
		h2.put(102, "harsh");
		h2.put(103, "keyur");
		h2.put(104, "rajesh");
		h2.put(102, "vijay");

		System.out.println(h2);
		System.out.println(h2.put(101, "happy"));
		System.out.println(h2);
		System.out.println("key set " + h2.keySet());
		System.out.println("value set " + h2.values());
		Set<?> s1 = h2.entrySet();
		System.out.println("entry set " + s1);

		Iterator<?> i1 = s1.iterator();

		while (i1.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) i1.next();
			System.out.println(mapEntry.getKey() + ".." + mapEntry.getValue());
		}
		System.out.println("<<<<<<<TREEMAP>>>>>");
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(101, "ravi");
		treeMap.put(102, "harsh");
		treeMap.put(103, "keyur");
		treeMap.put(104, "rajesh");
		treeMap.put(102, "vijay");

		System.out.println(treeMap);
		treeMap.remove(104);
		System.out.println(treeMap);
		System.out.println("key set=" + treeMap.keySet());
		System.out.println("size =" + treeMap.size());
		System.out.println("empty =" + treeMap.isEmpty());

		System.out.println("frist =" + treeMap.firstKey());
		System.out.println("last =" + treeMap.lastKey());

		System.out.println("<<<<<<<<HASHTABLE>>>>>>>");
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(101, "ravi");
		hashTable.put(102, "harsh");
		hashTable.put(103, "keyur");
		hashTable.put(104, "rajesh");
		hashTable.put(102, "vijay");
		System.out.println(hashTable);
		System.out.println("empty =" + hashTable.isEmpty());

		System.out.println("table data");

		Enumeration<Integer> enumValue = hashTable.keys();
		while (enumValue.hasMoreElements()) {
			System.out.println(enumValue.nextElement());
		}

	}

}

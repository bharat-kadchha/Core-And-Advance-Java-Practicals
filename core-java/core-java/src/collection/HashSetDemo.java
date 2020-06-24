package collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>(12, 0.30f); // capacity/fill ratio

		hashSet.add("12");
		hashSet.add("a");
		hashSet.add("c");
		hashSet.add("d");
		hashSet.add("c");
		hashSet.add(null);
		hashSet.add("d");

		System.out.println(hashSet);
		// h.remove("c");

		HashSet<String> hashSet2 = new HashSet<String>(hashSet);
		System.out.println(hashSet2);
	}
}
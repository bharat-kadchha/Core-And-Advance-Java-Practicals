package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {

		LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
		hashSet.add("12");
		hashSet.add("a");
		hashSet.add("c");
		hashSet.add("d");
		hashSet.add("d");
		hashSet.add(null);
	
		System.out.println(hashSet);
		
		hashSet.remove("c");
		System.out.println(hashSet);
	}

}

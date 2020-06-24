package leb_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ListDemo {
	public static void main(String[] args) {

		LinkedList<Object> list = new LinkedList<Object>();
		list.add(1);
		list.add("arrayList");
		list.add("arrayList");
		list.add(12.20);
		list.add("xyz");
		System.out.println(list);
		list.addFirst("x");
		list.addLast(null);
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.contains(3));
		System.out.println(list.getFirst() + "..." + list.getLast());

		list.removeFirst();
		list.removeLast();
		list.removeAll(list);
		System.out.println(list);

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("12");
		arrayList.add("arrayList");
		arrayList.add("12.2");
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		arrayList.removeAll(arrayList);
		System.out.println(arrayList);
		arrayList.add("23");
		arrayList.add(null);
		arrayList.add("abc");
		arrayList.add("xyz");
		System.out.println(arrayList.get(3));
		System.out.println(arrayList.set(0, "xyz"));
		System.out.println(arrayList);
		System.out.println(arrayList.lastIndexOf("abc"));
		arrayList.add(2, "mno");
		System.out.println(arrayList);

		HashSet<String> hashSet = new HashSet<String>(12, 0.30f); // capacity/fill retio
		hashSet.add("12");
		hashSet.add("arrayList");
		hashSet.add("c");
		hashSet.add("d");
		hashSet.add("c");
		hashSet.add(null);
		hashSet.add("d");

		System.out.println(hashSet);
		// hashSet.remove("c");

		HashSet<String> hashSet2 = new HashSet<String>(hashSet);
		System.out.println(hashSet2);

		LinkedHashSet<String> linkHashSet = new LinkedHashSet<String>();
		linkHashSet.add("12");
		linkHashSet.add("arrayList");
		linkHashSet.add("c");
		linkHashSet.add("d");
		linkHashSet.add("d");
		linkHashSet.add(null);
		System.out.println(linkHashSet);
		hashSet.remove("c");

	}

}

package collection;

import java.util.LinkedList;

public class LikedListDemo {
	public static void main(String[] args) {

		LinkedList<Object> list = new LinkedList<Object>();
		list.add(1);
		list.add("a");
		list.add("a");
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

	}

}

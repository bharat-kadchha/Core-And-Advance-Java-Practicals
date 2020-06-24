package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static <E> void main(String[] args) {

		LinkedList<Object> list = new LinkedList<Object>();
		list.add(1);
		list.add("a");
		list.add("b");
		list.add(12.20);
		list.add("xyz");

		list.addFirst("x");
		list.addLast(null);
		
		System.out.println(list);
		ListIterator<Object> list1 = list.listIterator();

		System.out.println(list1.hasNext());
		System.out.println(list1.hasPrevious());
		System.out.println(list1.next());
		System.out.println(list1.next());
		System.out.println(list1.next());
		System.out.println(list1.previous());
		System.out.println(list1.nextIndex());
		System.out.println(list1.previousIndex());
	
		list1.remove();
		System.out.println(list);
		list1.add(55);
		System.out.println(list1);

	}

}

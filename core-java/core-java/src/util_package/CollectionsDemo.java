package util_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(13);
		list.add(30);
		list.add(0);
		Collections.sort(list);
		System.out.println("index is--" + Collections.binarySearch(list, 30));
		System.out.println(Collections.checkedList(list, Integer.class));

		Collections.reverse(list);
		System.out.println("reverse list--" + list);

		Collections.shuffle(list);
		System.out.println("suffle list--" + list);

		Collections.swap(list, 0, 3);
		System.out.println(list);

		System.out.println("max vlaue--" + Collections.max(list));
		System.out.println("min vlaue--" + Collections.min(list));

		System.out.println("frequency--" + Collections.frequency(list, 30));

		Set<String> set = Collections.emptySet();
		System.out.println("set--" + set);

		List<Integer> list1 = new ArrayList<>();
		Collections.copy(list, list1);
		System.out.println(list1);

		Map<String, Object> map = Collections.emptyMap();
		System.out.println("map-" + map);

		map = Collections.singletonMap("id", "12FUN789");
		System.out.println(map);

	}
}

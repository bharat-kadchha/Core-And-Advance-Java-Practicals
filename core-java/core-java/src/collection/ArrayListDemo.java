package collection;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Object> arrayList=new ArrayList<Object>();
	
		
		arrayList.add("12");
		arrayList.add("a");
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
		System.out.println(arrayList.set(0,"xyz"));
		System.out.println(arrayList);
		System.out.println(arrayList.lastIndexOf("abc"));
		
		arrayList.add(2,"mno");
		System.out.println(arrayList);
		
	
	
	}

}

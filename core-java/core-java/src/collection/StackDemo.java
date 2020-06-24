package collection;

import java.util.ArrayList;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("23");
		list.add("@");
		list.add("12.3");

		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.capacity());
		stack.ensureCapacity(25);
		
		System.out.println(stack.capacity());
		stack.add("123");
		stack.push("abc");
		stack.addAll(list);
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.empty());
		
		stack.set(2, "ABC");
		System.out.println(stack);

		System.out.println(stack.search("abc"));
		System.out.println(stack.search("mn"));

	}

}

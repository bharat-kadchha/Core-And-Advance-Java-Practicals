package utilPackageExample;

public class StringAll {

	public static void concateString() {
		String s = "hello ";
		for (int i = 0; i < 10000; i++) {
			s = s + "world";
		}
	}

	public static void concateStringBuffer() {
		StringBuffer sb = new StringBuffer("hello ");
		for (int i = 0; i < 10000; i++) {
			sb.append("world");
		}
	}

	public static void concateStringBuilder() {
		StringBuilder sb = new StringBuilder("hello ");
		for (int i = 0; i < 10000; i++) {
			sb.append("world");
		}
	}

	public static void main(String[] args) {

		long t = System.currentTimeMillis();
		concateString();
		System.out.println("time taken by String =" + (System.currentTimeMillis() - t) + "ms");

		t = System.currentTimeMillis();
		concateStringBuffer();
		System.out.println("time taken by StringBuffer =" + (System.currentTimeMillis() - t) + "ms");

		t = System.currentTimeMillis();
		concateStringBuilder();
		System.out.println("time taken by StringBuilder =" + (System.currentTimeMillis() - t) + "ms");

	}

}/*
	 * STRING
	 * 
	 * 1) immutable. (we can String s="abc";) 2) slow and consumes more memory when
	 * you concat too many strings because every time it creates new instance. 3)
	 * String class overrides the equals() method of Object class.
	 * 
	 * 1) is mutable.(always syntex with new) 2) StringBuffer is fast and consumes
	 * less memory when you concat strings. 3) StringBuffer class doesn't override
	 * the equals() method of Object class. 4) StringBuffer is less efficient than
	 * StringBuilder. 5) StringBuffer is synchronized i.e. thread safe. 6) It means
	 * two threads can't call the methods of StringBuffer simultaneously.
	 * 
	 * 1) StringBuilder is more efficient than StringBuffer. 2) StringBuilder is
	 * non-synchronized i.e. not thread safe. 3) It means two threads can call the
	 * methods of StringBuilder simultaneously.
	 * 
	 * 
	 */
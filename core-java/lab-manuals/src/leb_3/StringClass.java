package leb_3;

public class StringClass {
	public static void main(String[] args) {
		String string1 = new String("abcdabcd");

		System.out.println("String length =" + string1.length());

		System.out.println("character at 4 =" + string1.charAt(4));

		System.out.println("sub string = " + string1.substring(2));

		System.out.println("sub string = " + string1.substring(2, 5));

		System.out.println("");

		String s1 = " abcd ";
		String s2 = "efgh";
		System.out.println("concate =" + s1.concat(s2));
		System.out.println("concate =" + (s1 + s2));

		System.out.println("index of =" + string1.indexOf("c"));

		System.out.println("index of =" + string1.indexOf("c", 3));

		System.out.println("equality =" + "abc".equals("abc"));

		System.out.println("equality =" + "abc".equals(s1));

		System.out.println("equality =" + "abc".equalsIgnoreCase("ABC"));

		System.out.println("compare to =" + s1.compareTo(string1));

		System.out.println("trim to =" + s1.trim());

		String string2 = new String("welcome to java");
		String string3 = "welcome to java";
		String string4 = string2;

		System.out.println(string2 == string4);
		System.out.println(string2 == string3);
		System.out.println(string2.equals(string3));

		System.out.println("java abcd xyz".matches("abcd.*")); // .* it means sub string

	}

}

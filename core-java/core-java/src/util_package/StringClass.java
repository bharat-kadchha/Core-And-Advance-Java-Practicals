package utilPackageExample;

public class StringClass {
	public static void main(String[] args) {
		String string = new String("abcdabcd");

		System.out.println("String length =" + string.length());

		System.out.println("character at 4 =" + string.charAt(4));

		System.out.println("sub string = " + string.substring(2));

		System.out.println("sub string = " + string.substring(2, 5));

		System.out.println("");

		String string1 = " abcd ";
		String s2 = "efgh";
		System.out.println("concate =" + string1.concat(s2));
		System.out.println("concate =" + (string1 + s2));

		System.out.println("index of =" + string.indexOf("c"));

		System.out.println("index of =" + string.indexOf("c", 3));

		System.out.println("equality =" + "abc".equals("abc"));

		System.out.println("equality =" + "abc".equals(string1));

		System.out.println("equality =" + "abc".equalsIgnoreCase("ABC"));

		System.out.println("compare to =" + string1.compareTo(string));

		System.out.println("trim to =" + string1.trim());

		String string3 = new String("welcome to java");
		String string4 = "welcome to java";

		String string5 = string3;

		System.out.println(string3 == string5);
		System.out.println(string3 == string4);
		System.out.println(string3.equals(string4));

		System.out.println("java abcd xyz".matches("abcd.*")); // .* it means sub string

		System.out.println("123+abc");

	}

}

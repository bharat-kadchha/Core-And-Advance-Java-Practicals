package knowledge;

public class CompareString {

	public static void main(String[] args) {

		String s1 = "Hello World";
		String s2 = "hello world";
		Object objStr = s1;

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareTo(objStr.toString()));

		System.out.println("uppercase=" + s1.toUpperCase());

		System.out.print(s2.contains("hello")); // it is in or not (find in string)
	}

}

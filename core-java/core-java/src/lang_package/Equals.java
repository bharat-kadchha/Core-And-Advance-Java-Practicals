package lang_package;

public class Equals {

	public static void main(String[] args) {

		String s = null;
		String s1 = new String("rakesh");
		String s2 = new String("rahul");
		String s3 = new String("rakesh");
		String s4 = s1;

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

		System.out.println(s1.equals(s3)); // contain compression
		System.out.println(s4 == s1); // Reference compression

		System.out.println(s1 == null);
		System.out.println(s = null);
		System.out.println(null == null);

	}
}
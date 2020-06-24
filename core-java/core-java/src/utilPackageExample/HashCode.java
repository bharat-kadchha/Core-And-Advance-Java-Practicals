package utilPackageExample;

public class HashCode {

	public static void main(String[] args) {
		System.out.println("hashcode of String");
		String string = "abc";
		System.out.println(string.hashCode());
		string = string + "defg";
		System.out.println(string.hashCode());

		System.out.println("hashcode of Stringbuffer");
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb.hashCode());
		sb.append("defg");
		System.out.println(sb.hashCode());
	}

}

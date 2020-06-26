package basic_programs;

public class StringCapacity {
	public static void main(String[] args) {

		String string = "abcd";

		System.out.println(string.length());

		StringBuffer sb = new StringBuffer(20);
		sb.append("1234qqqqq567890111111");

		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}

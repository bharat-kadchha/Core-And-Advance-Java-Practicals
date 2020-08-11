package extra;

public class AppendCodePointDemo {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("helo world.");
		
		System.out.println(buffer);
		buffer.append("of java");
		System.out.println(buffer);
		buffer.appendCodePoint(65);
		System.out.println(buffer);
		buffer.appendCodePoint(143);
		System.out.println(buffer);


	}
}

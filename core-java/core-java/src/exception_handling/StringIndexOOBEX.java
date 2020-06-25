package exceptionhandling;

public class StringIndexOOBEX {
	public static void main(String[] args) {

		try {

			String string = "hello world";
			char charAt = string.charAt(15);
			System.out.println("character " + charAt);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String out of index");
		}

	}
}

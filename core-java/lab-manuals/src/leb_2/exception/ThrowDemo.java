package leb_2.exception;

public class ThrowDemo {

	static void validage(int n) {
		if (n < 25) {
			throw new ArithmeticException("not valid");
		} else {
			System.out.println("valid age");
		}
	}

	public static void main(String[] args) {

		validage(12);
	}
}

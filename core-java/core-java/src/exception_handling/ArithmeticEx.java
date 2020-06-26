package exception_handling;

public class ArithmeticEx {

	public static void main(String[] args) {

		try {

			int a = 12 / 0;
			System.out.println("a=" + a);
		} catch (ArithmeticException w) {
			System.out.println("handle");
		} finally {
			System.out.println("finally block");
		}

		System.out.println("exception handeled..");
	}
}

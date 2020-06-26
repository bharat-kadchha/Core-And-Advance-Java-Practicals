package exception_handling;

public class ThrowableDemo {

	public static void method() throws Throwable {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			throw e;
		}
	}

	public static void main(String[] args) throws Throwable {
		try {

			method();

		} catch (Exception e) {

			System.out.println(e.fillInStackTrace()); //
			System.out.println(e.getCause()); // return cause
			System.out.println(e.getLocalizedMessage()); // return local message
			System.out.println(e.getMessage()); /// return message
			System.out.println(e.getStackTrace()[0]); // handle stack for exception hierarchy.
			e.printStackTrace(); //

		}

	}

}

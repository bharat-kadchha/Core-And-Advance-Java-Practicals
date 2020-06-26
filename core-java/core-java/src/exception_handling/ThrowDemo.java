package exception_handling;

public class ThrowDemo {
	static void myMethod() {
		try {

			throw new NullPointerException("demo");

		} catch (NullPointerException e) {
			System.out.println("method " + e);
			throw e; // re-throw
		}
	}

	public static void main(String[] args) {
		try {
			myMethod();
		} catch (NullPointerException e) {
			System.out.println("main " + e);
		}
	}

}

package exceptionhandling;

public class NullPointerEx {
	public static void main(String[] args) {

		Object obj = null;
		try {
			System.out.println(obj.toString());
		} catch (NullPointerException e) {
			System.out.println("null pointer ");
		} finally {
			System.out.println("fianlly exeption is solved");
		}
	}

}

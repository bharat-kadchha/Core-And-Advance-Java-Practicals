package leb_2.exception;

public class ThrowsDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread.sleep(1000);
		System.out.println("Thread execute");

		try {
			int value = 1 / 0;
			System.out.println("value = " + value);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}
}

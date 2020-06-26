package exception_handling;

import java.io.IOException;

public class ExceptionThrow {
	public static void main(String[] args) {
		try {
			throw new IOException("hello");
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}

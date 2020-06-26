package exception_handling;

import java.io.IOException;

public class ChainedException {
	public static void main(String[] args) {
		try {
			devide(10, 0);
			
		} catch (ArithmeticException e) { 
			System.out.println("orignal =" + e);
			System.out.println("cause =" + e.getCause());

		}

	}

	static void devide(int i, int j) {

		if (j == 0) {
			ArithmeticException ae = new ArithmeticException("value ZERO"); // create object directly
			ae.initCause(new IOException("wrong input"));
			throw ae;
		} else {
			System.out.println("ans =" + i / j);

		}

	}

}

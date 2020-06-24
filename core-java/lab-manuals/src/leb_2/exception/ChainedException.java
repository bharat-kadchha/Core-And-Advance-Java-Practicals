package leb_2.exception;

import java.io.IOException;

public class ChainedException {

	static void devide(int i, int j) {
		if (j == 0) {
			ArithmeticException ae = new ArithmeticException("value ZERO"); // override the Exception class method

			ae.initCause(new IOException("wrong input"));

			System.out.println(ae.fillInStackTrace());
			throw ae;

		} else {
			System.out.println("answer =" + i / j);
		}

	}

	public static void main(String[] args) {
		try {

			devide(10, 2);
		} catch (ArithmeticException e) {
			System.out.println("orignal =" + e);
			System.out.println("cause =" + e.getCause());

		}

	}

}

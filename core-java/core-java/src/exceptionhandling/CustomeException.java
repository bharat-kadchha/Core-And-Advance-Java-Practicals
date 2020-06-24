package exceptionhandling;

import java.util.Scanner;

public class CustomeException {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR ID =");
		int id = sc.nextInt();
		sc.close();
		try {
			if (id < 10) {
				System.out.println("valid user");
			} else
				throw new MyException("invalid user");

		} catch (MyException e) {
			System.out.println("UDE :" + e);
		}

	}

}

class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	MyException(String msg) {

		super(msg);
	}
}

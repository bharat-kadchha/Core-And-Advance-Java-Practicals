package leb_2.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTypes {

	public static void main(String[] args) throws ArithmeticException {

		Object o = null;
		try {
			System.out.println(o.toString());
		} catch (NullPointerException e) {
			System.out.println(e);
		}

		String s = "hello";
		try {
			s.charAt(6);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			int a = 1 / 0;
			System.out.println("a=" + a);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		try {

			File file = new File("src/myfile.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			System.out.println("free space-" + file.getFreeSpace());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

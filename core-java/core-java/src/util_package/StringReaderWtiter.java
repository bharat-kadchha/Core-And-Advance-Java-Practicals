package util_package;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderWtiter {

	public static void main(String[] args) throws IOException {

		String s1 = new String("hello java.....");
		StringReader sr = new StringReader(s1);

		int i = sr.read();

		while (i != -1) {

			if (i == 104)

				sr.skip(i); // return skip number
			else {
				System.out.println((char) i);
				i = sr.read();
			}
		}
	}

}

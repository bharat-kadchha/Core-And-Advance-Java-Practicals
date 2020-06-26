package iopackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("src/abc.txt");
		InputStreamReader isr = new InputStreamReader(fis);

		// it is class to convert my binary input data into character
		int value = isr.read();
		while (value != -1) {
			System.out.println((char) value);
			value = isr.read();
		}
		isr.close();
		fis.close();
	}

}

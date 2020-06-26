package iopackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClassDemo {

	public static void main(String[] args) throws IOException {
		File fileObj1 = new File("src/abc.txt");
		FileReader fileReader = new FileReader(fileObj1);

		// char []charValue=new char[20]; here fixed size is bad code.
		char[] charValue = new char[(int) fileObj1.length()];
		fileReader.read(charValue);
		System.out.println(charValue);

		System.out.println("*******");
		fileReader.close();

		FileReader fileReader1 = new FileReader(fileObj1);

		int next = fileReader1.read();
		while (next != -1) {
			System.out.print((char) next);
			next = fileReader1.read();
		}
		fileReader1.close();

	}
}

package iopackage;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {

	public static void main(String[] args) throws IOException {

		// in BufferedWriter not directly communicate with file

		// but in PrintWriter we can directly communicate with file

		// we can write primitive data also
		PrintWriter pw = new PrintWriter("src/abc.txt");

		pw.println(98);
		pw.println(12.45f);
		pw.println(true);

		char c[] = { 'a', 'b', 'c' };
		pw.print(c);
		pw.flush();
		pw.close();
	}

}

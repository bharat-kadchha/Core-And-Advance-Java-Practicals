package iopackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Printstream {

	public static void main(String[] args) throws FileNotFoundException {

		int i = 10;
		String string1 = "hi..";
		String string2 = "how r u ?";
		float value = 12.2f;
		FileOutputStream fo = new FileOutputStream("src/.../file.txt");
		PrintStream ps = new PrintStream(fo);

		ps.print("hello");
		ps.println(12);
		ps.println('a');
		ps.printf("%d", i);
		ps.printf("string=%string1 \n int =%d\n float=%value", string1, i, value);
		ps.format(string1, string2);

		ps.close();
	}
}

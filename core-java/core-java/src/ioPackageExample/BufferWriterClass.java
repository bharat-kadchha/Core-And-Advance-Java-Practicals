package ioPackageExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterClass {
	public static void main(String[] args) throws IOException {

		// BufferedWriter not communicate directly file so create FileWriter obj.

		FileWriter fw = new FileWriter("src/abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(98);
		bw.newLine(); // newline not possible in FileWriter so its method to goto newline in
						// BufferedWriter

		String s = new String("hello\n"); // \n not work
		bw.write(s);
		bw.newLine();
		char[] c = { 'k', 'l', 'm' };
		bw.write(c);
		bw.flush();
		bw.close();

	}

}

package ioPackageExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderClass {
	public static void main(String[] args) throws IOException {

		// BufferReader can't communicate directly file so create FileReader object
		FileReader fb = new FileReader("src/abc.txt");
		BufferedReader br = new BufferedReader(fb);

		// BR is best of all reader class. its read line by line ..all method of
		// fileReader works for BR.
		br.ready();

		String line = br.readLine();

		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}

		br.close();

	}

}

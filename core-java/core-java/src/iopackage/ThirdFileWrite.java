package iopackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ThirdFileWrite {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("src/frist.txt");

		FileReader fr = new FileReader("src/third.txt");
		BufferedReader bw = new BufferedReader(fr);
		String line = bw.readLine();
		while (line != null) {
			pw.println(line);
			line = bw.readLine();
		}
		pw.flush();
		pw.close();
		bw.close();

		FileReader fr1 = new FileReader("src/second.txt");
		BufferedReader bw1 = new BufferedReader(fr1);
		line = bw1.readLine();
		while (line != null) {
			pw.println(line);
			line = bw.readLine();
		}
		fr1.close();
		bw1.close();

	}

}

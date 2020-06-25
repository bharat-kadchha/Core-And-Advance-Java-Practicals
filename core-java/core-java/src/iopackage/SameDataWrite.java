package ioPackageExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SameDataWrite {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("srcsamedata.txt");

		BufferedReader br1 = new BufferedReader(new FileReader("src/abcd.txt"));
		String line = br1.readLine();

		while (line != null) {
			boolean flag = false;
			BufferedReader br2 = new BufferedReader(new FileReader("/src/1234.txt"));
			String target = br2.readLine();
			while (target != null) {
				if (line.equals(target)) {
					flag = true;
					break;
				}
				target = br2.readLine();
			}
			if (flag == false) {
				pw.println(line);
				// pw.flush();
			}
			line = br1.readLine();
		}
		pw.flush();
		pw.close();
		br1.close();

	}

}

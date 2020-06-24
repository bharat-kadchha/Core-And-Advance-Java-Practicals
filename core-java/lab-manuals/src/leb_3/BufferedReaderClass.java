package leb_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter 2 data =");
		String data1 = br.readLine();
		String data2 = br.readLine();

		System.out.println("concate =" + data1 + data2);

		int i = Integer.parseInt(data1);
		int j = Integer.parseInt(data2);
		System.out.println("sum =" + (i + j));

		br.close();
	}

}

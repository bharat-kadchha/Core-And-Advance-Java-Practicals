package userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your value..");
		int i = Integer.parseInt(br.readLine());
		System.out.println("enter your name..");
		String name = br.readLine();

		System.out.println("enroll " + i);
		System.out.println("name " + name);

	}
}

package leb_3;

import java.io.*;

public class BinaryFile {
	public static void main(String[] args) throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream("abc1.txt");
		ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream);
		objOutputStream.write(123);
		objOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("abc1.txt");
		ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
		System.out.println(objInputStream.read());

		objInputStream.close();
	}

}

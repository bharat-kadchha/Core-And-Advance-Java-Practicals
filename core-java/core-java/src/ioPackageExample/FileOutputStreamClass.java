package ioPackageExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileOutputStreamClass {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("src/myfile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.write(123);
		oos.close();

		FileInputStream fis = new FileInputStream("src/myfile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(fis.read());

		ois.close();

	}

}

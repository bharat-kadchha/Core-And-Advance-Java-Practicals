package iopackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("src/abc.txt");
		int intValue = 1;
		long longValue = 986876;
		String string = "hello java";

		RandomAccessFile rAccessFile = new RandomAccessFile(file, "rw");

		rAccessFile.writeInt(intValue);
		rAccessFile.writeLong(longValue);
		rAccessFile.writeUTF(string);

		rAccessFile.seek(14);
		System.out.println(rAccessFile.readLine());

		rAccessFile.seek(0);
		System.out.println(rAccessFile.readInt());
		rAccessFile.seek(4);
		System.out.println("pointer pisition =" + rAccessFile.getFilePointer());
		System.out.println(rAccessFile.readLong());
		System.out.println(rAccessFile.getFilePointer());

		rAccessFile.close();
	}
}
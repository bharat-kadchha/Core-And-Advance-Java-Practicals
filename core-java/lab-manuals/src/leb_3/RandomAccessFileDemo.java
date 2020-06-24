package leb_3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("abc.txt");
		int intValue = 1;
		long longValue = 986876;
		String stringValue = "hello java";

		RandomAccessFile random = new RandomAccessFile(file, "rw");

		random.writeInt(intValue);
		random.writeLong(longValue);
		random.writeUTF(stringValue);

		// r.seek(14);
		System.out.println(random.readLine());

		random.seek(0);
		System.out.println(random.readInt());

		System.out.println("pointer pisition =" + random.getFilePointer());
		System.out.println(random.readLong());
		System.out.println(random.getFilePointer());
		random.close();

	}
}
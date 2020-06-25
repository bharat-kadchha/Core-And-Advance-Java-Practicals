package ioPackageExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileInputStreamClass {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("src/myfile.txt");
		FileChannel fc = null;
		int avaliable = 0;
		int byteNo = 0;
		long position;

		while ((byteNo = fis.read()) != -1)

		{
			// if(i!=null)
			{
				fc = fis.getChannel();
				position = fc.position();
				avaliable = fis.available();

				System.out.print("position =" + position);
				System.out.print("avaliable byte =" + avaliable);
				System.out.println(" read position =" + (char) byteNo);
				// i=f.read();
			}

		}

		fis.close();

	}

}

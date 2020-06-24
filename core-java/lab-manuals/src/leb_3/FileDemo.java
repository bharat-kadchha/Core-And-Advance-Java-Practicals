package leb_3;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) throws IOException {

		File file1 = new File("F:/bin/file1.txt");// here not create a file ,,

		file1.createNewFile(); // physically file created here.....

		System.out.println("does exist ?" + file1.exists());

		File file2 = new File("F:/a");
		file2.mkdir(); // ONR DIRECTORY
		file2.mkdirs(); // MULTIPLE DIRECTORY

		System.out.println("success");
		System.out.println("does exist ?" + file1.exists());

		System.out.println("file hase " + file1.length() + "bytes");
		System.out.println("can it read ?" + file1.canRead());
		System.out.println("can it write ?" + file1.canWrite());
		System.out.println("is directory " + file1.isDirectory());
		System.out.println("is it file ?" + file1.isFile());
		System.out.println("is it absolute ?" + file1.isAbsolute());
		System.out.println("is it hidden ?" + file1.isHidden());

		System.out.println("absolute path =" + file1.getAbsolutePath());
		System.out.println("last modified date =" + new Date(file1.lastModified()));

	}

}

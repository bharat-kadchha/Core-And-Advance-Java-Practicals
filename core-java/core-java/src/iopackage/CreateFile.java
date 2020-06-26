package iopackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File fileObj1 = new File("src/file1.txt");
		// here not create a file ,,it is just javafile object reference to ("file1.txt")

		System.out.println("does exist ?" + fileObj1.exists());
		
		fileObj1.createNewFile(); // physically file created using this method..

		File fileObj2 = new File("F:/new Folder");
		fileObj2.mkdir(); // ONR DIRECTORY
		fileObj2.mkdirs(); // MULTIPLE DIRECTORY

		System.out.println("success");
		System.out.println("does exist ?" + fileObj1.exists());

		System.out.println("file hase " + fileObj1.length() + "bytes");
		System.out.println("can it read ?" + fileObj1.canRead());
		System.out.println("can it write ?" + fileObj1.canWrite());
		System.out.println("is directory " + fileObj1.isDirectory());
		System.out.println("is it file ?" + fileObj1.isFile());
		System.out.println("is it absolute ?" + fileObj1.isAbsolute());
		System.out.println("is it hidden ?" + fileObj1.isHidden());
		System.out.println("absolute path =" + fileObj1.getAbsolutePath());
		System.out.println("canonical path =" + fileObj1.getCanonicalFile());
		System.out.println("last modified date =" + new Date(fileObj1.lastModified()));

	}

}

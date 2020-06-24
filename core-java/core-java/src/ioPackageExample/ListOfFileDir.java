package ioPackageExample;

import java.io.File;

public class ListOfFileDir {

	public static void main(String[] args) {

		int fileCount = 0, dirCount = 0;
		File file = new File("src");
		System.out.println(file.exists());
		
		String[] list = file.list();
		for (String x : list) {
			File file2 = new File(file, x);
			if (file2.isFile()) {
				fileCount++;

			} else {
				dirCount++;
			}

		}
		System.out.println("total diractory is =" + dirCount);
		System.out.println("total file is=" + fileCount);
	}

}

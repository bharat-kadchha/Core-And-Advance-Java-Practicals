package iopackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClassDemo {

	public static void main(String[] args) throws IOException {

		// FileWriter fileWriter=new FileWriter("abc.txt"); == if u are run 100 times then data is override every time
		
		FileWriter fileWriter = new FileWriter("src/abc.txt", true); /// true for append data to previous data.

		fileWriter.write(98); // int value store character
		fileWriter.write("john cina\n"); // string value
		
		
		fileWriter.write('\n'); // in some system \n not work line separator,,solution is BufferWiter and PrintWriter
		
		char a[] = { 'a', 'b', 'c' }; // char array
		fileWriter.write(a);

		fileWriter.flush();
		fileWriter.close();

	}

}

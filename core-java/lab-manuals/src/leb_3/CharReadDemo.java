package leb_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharReadDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter file=new FileWriter("txt.txt");
		
		file.write("abcd");
		file.write('a');
		file.write(123);
		file.close();
		
		FileReader fileReader=new FileReader("txt.txt");
	
		int i=fileReader.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fileReader.read();
		}
		fileReader.close();
	}

}

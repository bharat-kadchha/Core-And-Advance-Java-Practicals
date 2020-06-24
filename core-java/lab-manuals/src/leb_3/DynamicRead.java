package leb_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DynamicRead {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("a.txt");

		fileWriter.write("word1 is word1");

		fileWriter.close();

		FileReader fileReader = new FileReader("a.txt");

		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String data1 = bufferedReader.readLine();
		String data2 = data1.replace("word1", "word2");

		System.out.println("orignal =" + data1);
		System.out.println("changable =" + data2);

		fileReader.close();

		FileWriter fw1 = new FileWriter("b.txt");
		fw1.write(data2);
		fw1.close();

	}

}

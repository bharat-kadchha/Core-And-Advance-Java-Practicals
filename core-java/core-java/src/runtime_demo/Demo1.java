package runtime_demo;

import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) {

		try {
			Runtime runtime = Runtime.getRuntime();
			System.out.println(runtime.availableProcessors());

			System.out.println("hello");

			runtime.exec("notepad"); 
			
			// runtime.exec("c:\\Windows\\System32\\shutdown -s -t 0"); -s == shutdown, -r == restart,,-t
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

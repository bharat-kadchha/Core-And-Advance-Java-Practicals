package runtime_demo;

import java.io.IOException;

public class ShutDownMyPc {

	public static void main(String[] args) {

		try {
			Runtime runtime = Runtime.getRuntime();
			System.out.println(runtime.availableProcessors());

			
			runtime.exec("c:\\Windows\\System32\\shutdown -s -t 0"); //-s == shutdown, -r == restart,,
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}

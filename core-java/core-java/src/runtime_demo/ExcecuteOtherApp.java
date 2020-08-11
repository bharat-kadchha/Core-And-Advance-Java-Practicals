package runtime;

import java.io.IOException;

public class ExcecuteOtherApp {

	public static void main(String[] args) {

		try {
			Runtime runtime = Runtime.getRuntime();
			runtime.exec("notepad");
			System.out.println("notepad running...");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package runtime;

public class LoadLibrary {

	public static void main(String[] args) {
		Runtime runTime = Runtime.getRuntime();
		runTime.loadLibrary("C:/Windows/System32/crypt32.dll");
		System.out.println("loading library...");
	}
}

package runtime;

public class ShutDownHook {

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(mt);

		System.out.println("application terminated..");

		runtime.removeShutdownHook(mt);
	}

	static class MyThread extends Thread {
		@Override
		public void run() {
			System.out.println("kill process...");
		}

	}
}

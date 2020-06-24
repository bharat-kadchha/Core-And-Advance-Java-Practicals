package maltithreading;

public class DeamonThreadDemo {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			public void run() {
				try {
					while (true) {
						System.out.println("Deamon thread is running");
					}
				} finally {
					System.out.println("Deamon thread is exciting");
				}

			}
		});

		thread.setDaemon(true);

		thread.start();

	}

}

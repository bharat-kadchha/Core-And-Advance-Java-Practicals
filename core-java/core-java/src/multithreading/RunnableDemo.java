package multithreading ;

public class RunnableDemo {

	public static void main(String[] args) {

		MyRunneble runnable = new MyRunneble();
		Thread thread1 = new Thread();
		Thread thread2 = new Thread(runnable);
		thread1.start();
		thread2.start();
		thread2.run();
		runnable.run();
	}
}

class MyRunneble implements Runnable {

	public void run() {
		System.out.println("child");
	}
}
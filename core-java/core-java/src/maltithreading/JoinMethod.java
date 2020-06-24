package maltithreading;

public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {

		MyThread6 thread6 = new MyThread6();

		thread6.start(); // child thread
		System.out.println("Thread is alive =" + thread6.isAlive());

		// main thread waiting to completing of child

		thread6.join(); // after complete 1000 ms then main thread execute
		for (int i = 0; i < 4; i++) {
			System.out.println("main");
		}

	}

}

class MyThread6 extends Thread {
	public void run() {
		for (int i = 0; i < 4; i++)
			try {
				System.out.println("child");
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
	}
}

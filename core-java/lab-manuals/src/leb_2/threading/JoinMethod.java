package leb_2.threading;

public class JoinMethod {
	public static void main(String[] args) throws InterruptedException {

		MyThread6 thread = new MyThread6();

		thread.start(); // child thread
		System.out.println("Thread is alive =" + thread.isAlive());
		// thread.join(); //main thread //main thread waiting to completeing of child
		thread.join(); // after complete 2000 ms then main thread execute
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

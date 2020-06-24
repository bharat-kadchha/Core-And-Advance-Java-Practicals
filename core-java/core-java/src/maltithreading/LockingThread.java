package maltithreading;

class Test {
	public synchronized void displayn() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
			}
		}
	}

	public synchronized void displayc() {
		for (int i = 65; i < 75; i++) {
			System.out.println((char) i);

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
			}
		}
	}

}

class MyThread3 extends Thread {
	Test test;

	MyThread3(Test test) {
		this.test = test;
	}

	public void run() {

		test.displayn();
	}
}

class MyThread4 extends Thread {
	Test test;

	MyThread4(Test test) {
		this.test = test;
	}

	public void run() {

		test.displayc();
	}
}

public class LockingThread {

	public static void main(String[] args) {

		Test test = new Test();
		// Test d2=new Test();

		MyThread3 thread3 = new MyThread3(test);
		MyThread4 thread4 = new MyThread4(test);

		thread3.start();
		thread4.start();

	}
}

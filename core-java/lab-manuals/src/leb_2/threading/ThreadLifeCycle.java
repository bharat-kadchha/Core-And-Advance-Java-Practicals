package leb_2.threading;

public class ThreadLifeCycle {

	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 = new MyThread2();
		thread2.start();

		thread2.suspend();
		thread1.start();
		// thread1.start(); illigalThreadStateException

		thread2.resume();

		thread2.stop();

	}
}

class MyThread1 extends Thread {
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("i =" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread {
	public void run() {

		for (int j = 0; j < 5; j++) {
			System.out.println("j =" + j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

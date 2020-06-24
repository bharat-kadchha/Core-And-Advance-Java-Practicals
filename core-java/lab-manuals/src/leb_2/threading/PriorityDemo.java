package leb_2.threading;

public class PriorityDemo {
	public static void main(String[] args) {

		MyThread thread = new MyThread();
		MyThread3 thread1 = new MyThread3();

		System.out.println("max priority =" + Thread.MAX_PRIORITY);
		System.out.println("min priority =" + Thread.MIN_PRIORITY);
		System.out.println("normal priority =" + Thread.NORM_PRIORITY);
		thread1.setPriority(9);
		thread.setPriority(3);
		thread.start();
		thread1.start();
		System.out.println("new priority =" + thread.getPriority());
	}

}

class MyThread extends Thread {
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

class MyThread3 extends Thread {
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

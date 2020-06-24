package maltithreading;

public class MultipleThread {

	public static void main(String[] args) {

		MyThread5 thread1 = new MyThread5();

		System.out.println(thread1.getId());

		System.out.println(thread1.getName());

		System.out.println(thread1.isAlive());
		thread1.start(); // Automatically call run method
		// thread1.stop(); //stop execution of thread
		thread1.suspend(); // ready to running
		System.out.println(thread1.isAlive());
		thread1.resume();

		MyThread2 thread2 = new MyThread2(); // t0 have no any method but pass in thread_object then all method access
		Thread theard = new Thread(thread2);

		theard.start();

	}

}

class MyThread5 extends Thread {

	public void run() {
		System.out.println("thread 1 running");
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

class MyThread2 implements Runnable { // reduce compilation time because interface define only require method
										// when extends thread class has all method and compile every time

	public void run() {
		System.out.println("thread 1 running");
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

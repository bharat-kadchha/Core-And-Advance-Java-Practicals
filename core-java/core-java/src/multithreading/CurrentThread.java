package multithreading;

public class CurrentThread {

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = Thread.currentThread(); // main thread call main method
		System.out.println(thread1.getName());
		System.out.println(thread1);

		thread1.setName("default thread");
		System.out.println(thread1.getName());
		System.out.println(thread1);
		thread1.setPriority(2);
		System.out.println(thread1);

		thread1.setPriority(Thread.NORM_PRIORITY);// 5
		thread1.setPriority(Thread.MIN_PRIORITY);// 1
		thread1.setPriority(Thread.MAX_PRIORITY);// 10
		// thread1.setPriority(15); IllegalArgumentException
		System.out.println(thread1);

		for (int i = 0; i < 10; i++) {
			System.out.println("i =" + i);
			Thread.sleep(900); // time in milliseconds
		}

	}

}

package leb_2.threading;

public class CurrentThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = Thread.currentThread();

		System.out.println(thread.getName());

		thread.setName("current thread");
		System.out.println("name =" + thread.getName());
		System.out.println("id =" + thread.getId());
		System.out.println(thread.getState());

		System.out.println("max priority =" + Thread.MAX_PRIORITY);
		System.out.println("min priority =" + Thread.MIN_PRIORITY);
		System.out.println("normal priority =" + Thread.NORM_PRIORITY);
		System.out.println(thread.isAlive());
		for (int i = 0; i < 5; i++) {
			thread.sleep(1000);
			System.out.println(i);
		}
	}

}

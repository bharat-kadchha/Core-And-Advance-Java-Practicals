package maltithreading;

public class YieldMethod{

	public static void main(String[] args) {

		// we cant say which thread will execute
		MyThread thread = new MyThread();
		thread.start();
		for (int i = 0; i < 4; i++)
			System.out.println("current thread= " + Thread.currentThread().getName());
	}

}

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 4; i++)
			System.out.println("child thread= " + Thread.currentThread().getName());
		Thread.yield(); // pause current execution
	}
}
//change of completing main thread is high .main thread gives more change to child thread
//we cant say 100% which one runs first and how long to serve
// jvm to jvm algorithm will may change ==fcfs,sjf,rr,etc
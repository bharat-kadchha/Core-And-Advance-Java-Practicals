package leb_2.threading;

public class YieadMethod {

	public static void main(String[] args) {

		// we cant say which thread will execute
		YieldThread t = new YieldThread();
		t.start();
		for (int i = 0; i < 4; i++)
			System.out.println("current thread= " + Thread.currentThread().getName());
	}

}

class YieldThread extends Thread {

	public void run() {
		for (int i = 0; i < 4; i++)
			System.out.println("child thread= " + Thread.currentThread().getName());
		Thread.yield(); // pause current execution
	}
}
//change of completing main thread is high
//main thread gives more change to child thread
//we can't say 100% which one runs first answers how long to serve

// jvm to jvm algorithm is change for example fcfs,sjf,rr,etc
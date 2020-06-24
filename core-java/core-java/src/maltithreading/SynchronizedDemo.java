package maltithreading;

class Display {
	public static synchronized void wish(String name) {

		// static --- different object and regular output why ?
		// sync for object level lock
		// static sync=for class level lock
		for (int i = 0; i < 5; i++) {
			System.out.print("good morning :");
			try {
				Thread.sleep(1500);
			}

			catch (InterruptedException e) {

			}
			System.out.println(name);

		}

	}

	void put() {
		System.out.println("completed......");

	}
}

class myThread1 extends Thread {
	Display display1;
	String name;

	myThread1(Display display1, String name) {
		this.display1 = display1;
		this.name = name;
	}

	public void run() {
		display1.wish(name);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display display1 = new Display();
		// display1.wish("dhoni"); call wish method manually ,but my thread call wish method
		
		Display display2 = new Display();
		myThread1 thread1 = new myThread1(display1, "ravi"); // only one thread are here,then synchronized not required.
		
		myThread1 thread2 = new myThread1(display2, "rahul");
		// myThread1 thread3=new myThread1(display1,"ranjit");

		thread1.start();
		thread2.start();
		
		// thread3.start(); //thread1 or thread2 which is first we can't decide.and output will not regular ,,multiple thread execute simultaneously
		
		display1.put(); // resolve this problem using method as synchronized

	}
}

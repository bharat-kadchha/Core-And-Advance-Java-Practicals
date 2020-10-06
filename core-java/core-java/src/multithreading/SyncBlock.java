package multithreading ;

class DemoClass {
	public void wish(String name) {

		// 10 lakhs line of code

		synchronized (DemoClass.class) {
			// to lock class level lock after completing its release.operation regular
		}

		synchronized (this) { /// here only require few line of code to synchronized then we can declare in
								/// block
								// not require to whole method as syc.
			for (int i = 0; i < 5; i++) {
				System.out.print("good morning :");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {

				}
				System.out.println(name);
			}
		}

		/// 10 lakh line of code

	}
}

class MyThreadClass extends Thread {
	DemoClass demoClass;
	String name;

	MyThreadClass(DemoClass demoClass, String name) {
		this.demoClass = demoClass;
		this.name = name;
	}

	public void run() {
		demoClass.wish(name);
	}
}

public class SyncBlock {

	public static void main(String[] args) {

		DemoClass demo1 = new DemoClass();
		MyThreadClass thread1 = new MyThreadClass(demo1, "ravi");
		MyThreadClass thread2 = new MyThreadClass(demo1, "rahul");
		// MyThread t3=new MyThread(ddemo1,"ranjit"); //with out class lock over o/p is
		// irregular
		thread1.start();
		thread2.start();

	}
}

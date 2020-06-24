package constructor;

class DemoTest {

	static DemoTest test = null;

	void print() {
		System.out.println("hello world...");

	}

	static DemoTest getIntance() {
		if (test == null)
			test = new DemoTest();

		return test;
	}

}

public class SingletonObejct {

	public static void main(String[] args) {

		DemoTest d1 = DemoTest.getIntance();
		d1.print();
		System.out.println(d1.hashCode());

		// same hashcode for d1 & d2.it mean singleton object created.
		
		DemoTest d2 = DemoTest.getIntance();
		System.out.println(d2.hashCode());

	}

}

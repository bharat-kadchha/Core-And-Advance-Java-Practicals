package constructor;

public class ConstructorDemo {

	int x;

	ConstructorDemo() {
		x = 30;
	}

	ConstructorDemo(int i) {

		x = i;
	}

	public static void main(String[] args) {

		// default Constructor
		ConstructorDemo con1 = new ConstructorDemo();
		System.out.println(con1.x);

		// parameterized Constructor
		ConstructorDemo con2 = new ConstructorDemo(50);
		System.out.println(con2.x);

	}

}

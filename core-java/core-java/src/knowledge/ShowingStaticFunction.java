package knowledge;

class A {
	public static void start() { // both method name is same with static .so base class method called
									// showingFunction.
		System.out.println("A start");
	}

	public void run() {
		System.out.println("A run");
	}
}

class B extends A {
	public static void start() {
		System.out.println("B start");
	}

	public void run() {
		System.out.println("B run");
	}
}

public class ShowingStaticFunction {

	public static void main(String[] args) {

		A a = new B(); // static function call of that class which class object call it.so a.start() call.
		a.start();

		a.run(); // here non-static function belong instance class B.so call b Class function.

		B b = new B();
		b.start();

		b.run();

	}
}

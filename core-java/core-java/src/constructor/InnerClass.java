package constructor;

class Outer {
	private int value = 100;

	void test() { // inner class we can access private property.
		Inner innerClass = new Inner();
		innerClass.display();
	}

	class Inner {
		void display() {
			System.out.println("outer value = " + value);
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {

		Outer outerClass = new Outer();
		outerClass.test();
	}

}

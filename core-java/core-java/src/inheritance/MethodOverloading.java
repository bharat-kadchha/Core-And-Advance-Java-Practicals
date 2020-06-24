package inheritance;

class TestClassDemo {

	int x, y;

	void checkMethod() {
		System.out.println("no perameter");
	}

	void checkMethod(int a, int b) {
		System.out.println("2 perameter");

	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		TestClassDemo tClassObject = new TestClassDemo();
		tClassObject.checkMethod();
		tClassObject.checkMethod(10, 20);

	}

}

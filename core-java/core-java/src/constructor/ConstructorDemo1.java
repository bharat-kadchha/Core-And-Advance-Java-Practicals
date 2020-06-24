package constructor;

class MyClass {
	int a, b;

	MyClass() {
		a = b = 0;
	}

	MyClass(int x, int y) {
		a = x;
		b = y;

	}

	void put() {
		System.out.println("a=" + a + "b=" + b);
	}
}

public class ConstructorDemo1 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.put();
		obj = new MyClass(10, 20);
		obj.put();

	}

}

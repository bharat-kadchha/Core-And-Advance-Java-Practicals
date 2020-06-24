package keyword;

class MyClass {
	int a, b, c;

	MyClass() {
	}

	MyClass(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void put() {
		System.out.println("a=" + a + "b=" + b + "c=" + c);
	}

}

public class ThisExample {

	public static void main(String[] args) {

		MyClass myClass = new MyClass(10, 20, 30);
		myClass.put();

	}

}

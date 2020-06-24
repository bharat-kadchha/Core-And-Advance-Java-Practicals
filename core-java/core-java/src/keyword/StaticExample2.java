package keyword;

public class StaticExample2 {

	static int i;
	int j;

	static void method1(int i, int j) { //
		System.out.println("here paassing non static value in static method");
	}

	void method2(int i) {
		System.out.println("static perameter pass in non statuc method also");

	}

	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {

		method1(10, 20);
		StaticExample2 obj = new StaticExample2();
		obj.method2(10);

	}

}

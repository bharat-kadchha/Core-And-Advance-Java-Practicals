package leb_1;

class FristClass {
	int a, b, c;

	FristClass() {
	}

	FristClass(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void put() {
		System.out.println("a=" + a + "b=" + b + "c=" + c);
	}

}

public class ThisKeyWordExample {

	public static void main(String[] args) {

		FristClass FristClass = new FristClass(10, 20, 30);
		FristClass.put();

	}

}

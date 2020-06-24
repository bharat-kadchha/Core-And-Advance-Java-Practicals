package constructor;

class Test1 {
	Test1() {
		System.out.println("A class constructor");
	}
}

class Test2 extends Test1 {
	Test2() {
		System.out.println("B class constructor");
	}
}

class Test3 extends Test2 {
	Test3() {
		System.out.println("C class constructor");
	}
}

public class OrderOfConstructor {

	public static void main(String[] args) {

		Test3 test = new Test3();
		System.out.println(test.toString());
	}

}

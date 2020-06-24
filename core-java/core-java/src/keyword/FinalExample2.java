package keyword;

//final class g then inheritance not possible
class Test1 {

	/// final void method1() then overriding not possible
	void method1() {
		System.out.println("super class");
	}
}

class Test2 extends Test1 {
	void method1() {
		System.out.println("sub class");
	}
}

public class FinalExample2 {

	public static void main(String[] args) {

		Test2 test = new Test2();
		test.method1();
	}

}

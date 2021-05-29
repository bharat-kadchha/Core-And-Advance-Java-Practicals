package leb_1;

interface TestClass {

	void fristMethod();
}

interface TestClass2 extends TestClass {
	void secondMethod();
}

class TestClass3 implements TestClass, TestClass2 {

	public void fristMethod() {
		System.out.println("TestClass interface implimented ");

	}

	public void secondMethod() {
		System.out.println("TestClass2 interface implimented");

	}
}

public class MultipleInterfaceExample {
	public static void main(String[] args) {

		TestClass3 testClass3 = new TestClass3();
		testClass3.secondMethod();
		testClass3.fristMethod();
	}

}

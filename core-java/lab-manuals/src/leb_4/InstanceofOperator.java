package leb_4;

public class InstanceofOperator {

	public static void main(String[] args) {

		String data = "java";
		if (data instanceof String) {
			System.out.println("yes");
		}

		TestClass testClass = new TestClass();
		DemoClass demoClass = new DemoClass();
		if (testClass instanceof TestClass & demoClass instanceof DemoClass) {
			System.out.println("yes1");
		}
		if (demoClass instanceof TestClass) {
			System.out.println("yes2");
		}
		TestClass testClass1 = new DemoClass();
		if (testClass1 instanceof TestClass & testClass1 instanceof DemoClass) {
			System.out.println("yes3");
		}

	}

}

class TestClass {

}

class DemoClass extends TestClass {

}

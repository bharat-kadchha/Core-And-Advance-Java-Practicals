package operatorAndloop;

public class InstanceofOperator {

	public static void main(String[] args) {

		String s = "java";
		if (s instanceof String) {
			System.out.println("yes");
		}

		Test testobj1 = new Test();
		Demo demoObj1 = new Demo();
		if (testobj1 instanceof Test & demoObj1 instanceof Demo) {
			System.out.println("yes1");
		}
		if (demoObj1 instanceof Test) {
			System.out.println("yes2");
		}
		Test testobj2 = new Demo();
		if (testobj2 instanceof Test & testobj2 instanceof Demo) {
			System.out.println("yes3");
		}

	}

}

class Test {

}

class Demo extends Test {

}

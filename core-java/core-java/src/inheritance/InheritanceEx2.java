package inheritance;

class TestClass {
	int i = 10;// access specifier by default : default
	int j = 20;
}

class TestClass2 extends TestClass {
	void show() {
		System.out.println("i " + i + " j " + j);
	}

}

public class InheritanceEx2 {

	public static void main(String[] args) {

		TestClass2 testobject = new TestClass2();
		testobject.show();

	}

}

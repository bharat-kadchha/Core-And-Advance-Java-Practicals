package inheritance;

class Parent {
	void show() {
		System.out.println("superclass");
	}
}

class Child extends Parent {
	void show() {
		System.out.println("subclass");
	}
}

public class MethodOveridding {

	public static void main(String[] args) {

		Child child = new Child();

		child.show();

	}
}

package leb_1;

class ParentClass {
	void show() {
		System.out.println("superclass");
	}
}

class ChildClass extends ParentClass {
	void show() {
		System.out.println("subclass");
	}

	void show(int i) {
		System.out.println("subclass i=" + i);
	}

	void show(int i, int j) {
		System.out.println("subclass i=" + i + " and j=" + j);
	}
}

public class PolymorphismExample{

	public static void main(String[] args) {

		ChildClass childClass = new ChildClass();

		childClass.show();
		childClass.show(20);
		childClass.show(50, 60);
	}
}

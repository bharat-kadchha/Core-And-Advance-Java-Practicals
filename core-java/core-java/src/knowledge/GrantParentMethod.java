package knowledge;

class Test4 {
	public void get() {
		System.out.println("grant parent");
	}
}

class Test2 extends Test4 {
	public void get() {
		super.get();
		System.out.println("parent");
	}
}

class Test3 extends Test2 {
	public void get() {
		// super.super.get(); //compile time error directly not call grant Parent method.
		super.get();
		System.out.println("child ");
	}
}

public class GrantParentMethod {

	public static void main(String[] args) {

		Test3 test3 = new Test3();

		test3.get();

	}

}

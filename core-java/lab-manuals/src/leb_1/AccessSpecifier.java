package leb_1;

class MethodcClass {
	public void name() {
		System.out.println("name");
	}
}

public class AccessSpecifier {

	public void publicMethod() {
		System.out.println("p1 public method");
	}

	protected void protectedMethod() {
		System.out.println("p1 protected method");
	}

	void defaultMethod() {
		System.out.println("p1 default method");
	}

	private void privateMethod() {
		System.out.println("p2 private method");
	}
}

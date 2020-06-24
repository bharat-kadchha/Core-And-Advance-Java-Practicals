package knowledge;

class Test {
	static int s = 10;
	int a = 20;

	public void done() {
		System.out.println("intance method" + s + a); // instance method calls instance and static variable,
	}

	public static void ok() // static method only calls static variable.
	{
		System.out.println("static method.." + s);
	}
}

public class StaticAndInstanceMethod {

	public static void main(String[] args) {

		Test.ok(); /// static method call with out instance of same class.

		new Test().done(); // this method required instance of same class
	}
}

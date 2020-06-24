package knowledge;

//yes forward declaration are in java.where C++ has an issue.

public class ForwordDeclaration {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.fun(5);
	}
}

class Test1 {
	void fun(int x) {
		System.out.println("fun() called: x = " + x);
	}
}
package varagrs;

public class Varargs {

	static void test1(int v[]) {
		System.out.print("Number of args: " + v.length + " Contents: ");

		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	static void test2(int... v) {
		System.out.print("Number of args: " + v.length + " Contents: ");

		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		// Notice how an array must be created to
		// hold the arguments.
		int n1[] = { 10 };
		int n2[] = { 1, 2, 3 };
		int n3[] = {};
		test1(n1); // 1 arg
		test1(n2); // 3 args
		test1(n3); // no args

		test2();
		test2(2, 3, 4, 5, 6, 7, 8);
		test2(22, 22, 22);
	}

}

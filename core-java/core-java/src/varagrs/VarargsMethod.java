package varagrs;

public class Varargs1 {

	static void m1(int... x) {
		System.out.println("hello");

		int t = 0;
		for (int a : x) {
			t += a;
		}
		System.out.println("total=" + t);
	}

	public static void main(String[] args) {

		m1();

		m1(1, 2, 3);
		m1(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}

}

package leb_4;

public class Varargs1 {

	static void noOfAgrs(int... values) {
		System.out.println("hello");

		int total = 0;
		for (int value : values) {
			total += value;
		}
		System.out.println("total=" + total);
	}

	public static void main(String[] args) {

		noOfAgrs();

		noOfAgrs(1, 2, 3);
		noOfAgrs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}

}

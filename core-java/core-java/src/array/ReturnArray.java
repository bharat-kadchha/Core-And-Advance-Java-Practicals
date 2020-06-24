package array;

public class ReturnArray {

	static int[] get() {
		return new int[] { 1, 3, 5, 3 };
	}

	public static void main(String[] args) {

		int array[] = get();

		for (int r : array) {
			System.out.println(r);
		}

	}
}

package array;

public class ArrayParameter {

	public static void Array(int[] a1) {
		for (int i = 0; i < a1.length; i++) {
			System.out.println(" " + a1[i]);
		}
	}

	public static int[] reverse(int[] array) {
		int[] b1 = new int[array.length];

		for (int i = 0, j = b1.length - 1; i < b1.length; i++, j--) {
			b1[j] = array[i];
		}
		return b1;
	}

	public static void main(String[] args) {

		Array(reverse(new int[] { 1, 2, 3, 4, 5 })); // array as a method argument

		// passing anonymous array to method (not to declare array)
	}

}

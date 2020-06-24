package operatorAndloop;

public class MaxArray {

	public static void main(String[] args) {

		int[] a1 = { 1, 4, 7, 2, 8 };

		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i] + " ");

		}
		int total = 0;
		for (int i = 0; i < a1.length; i++) {
			total += a1[i];
		}
		int max = a1[0];
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] > max) {
				max = a1[i];
			}
		}
		System.out.println("max value is=" + max);
	}

}

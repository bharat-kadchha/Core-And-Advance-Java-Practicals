package operator_and_loop;

public class MatrixSumMul {

	public static void main(String[] args) {

		int[][] a1 = { { 1, 2, 3 }, { 0, 0, 0 }, { 1, 2, 3 } };
		int[][] b1 = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int[][] c1 = new int[3][3];

		System.out.println("frist matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(" " + a1[i][j]);
			}
			System.out.println();

		}
		System.out.println("second matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" " + b1[i][j]);
			}
			System.out.println();

		}
		System.out.println("sum of 2 matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c1[i][j] = a1[i][j] + b1[i][j];
				System.out.print(c1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("multiplication of 2 matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c1[i][j] = 0;
				for (int k = 0; k < 3; k++) {

					c1[i][j] += a1[i][k] * b1[k][j];

				}
				System.out.print(c1[i][j] + " ");
			}
			System.out.println();

		}
	}
}

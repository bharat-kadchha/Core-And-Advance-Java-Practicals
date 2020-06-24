package operatorAndloop;

public class Matrix {

	public static void main(String[] args) {
		
		int[][] a1 = { { 1, 2 }, { 3, 4 }, { 4, 5 }, { 5, 6 } };
		
		for (int i = 0; i < 4; i++) {
		
			for (int j = 0; j < 2; j++) {
			
				System.out.print(" " + a1[i][j]);
			}
			System.out.println();
		}

	}

}

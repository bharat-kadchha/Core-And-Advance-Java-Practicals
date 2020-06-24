package array;

public class JaggedArray {
	public static void main(String[] args) {
		
		
		int array[][] = new int[3][];
		
		// it is like tree structure.
		array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[2];

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = count++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

}

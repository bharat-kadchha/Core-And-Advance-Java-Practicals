package exception_handling;

public class ArrayOutOfBoundEx {

	public static void main(String[] args) {

		int[] values = new int[4];
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		values[3] = 40;
		try {
			values[4] = 50;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			int sum = values[2] + values[3];
			System.out.println("sum=" + sum);

		}
	}

}

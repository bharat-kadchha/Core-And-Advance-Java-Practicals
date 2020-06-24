package operatorAndloop;

public class ShortCircuit {

	public static void main(String[] args) {

		int x = 10;
		if (++x < 10 && (x / 0 > 10)) {
			System.out.println("hello");
		} else {
			System.out.println("hi");
		}
		System.out.println("compilation time reduce");
	}

}

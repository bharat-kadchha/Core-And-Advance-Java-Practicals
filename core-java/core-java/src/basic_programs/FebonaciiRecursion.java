package basic_programs;

public class FebonaciiRecursion {

	public static int fibonacci(int number) {
		if ((number == 0) || (number == 1))
			return number;
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
	}

	public static void main(String[] args) {

		for (int counter = 0; counter <= 10; counter++) {
			System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
		}
	}

}

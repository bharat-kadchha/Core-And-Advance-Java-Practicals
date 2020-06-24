package basicPrograms;

public class FebonaciiDemo {

	public static void main(String[] args) {
		int next, previous = 0, current = 1;
		
		System.out.println(previous + "\n" + current);
		
		for (int i = 0; i < 10; i++) {
			next = previous + current;
			previous = current;
			current = next;
			System.out.println(next);
		}

	}

}

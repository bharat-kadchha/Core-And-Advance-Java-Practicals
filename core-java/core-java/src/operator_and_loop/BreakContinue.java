package operator_and_loop;

public class BreakContinue {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				break; // to terminate the for loop
			} else
				System.out.println(i);

		}
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue; // skip that iteration and move to next
			} else
				System.out.println(i);
		}
	}

}

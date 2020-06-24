package knowledge;

public class TerminateJVM {

	public static void main(String[] args) {

		char[] array = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'E') {
				System.out.println("terminate....");
				System.exit(0); // 0 Successful termination
			}
			System.out.println(array[i]);
		}
	}
}

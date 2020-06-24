package knowledge;

public class GotoDemo {

	public static void main(String[] args) {

		jump: for (int i = 0; i < 10; i++) {
			if (i == 2) {
				break jump;
			}
			System.out.println("i=" + i);
		}
	}
}

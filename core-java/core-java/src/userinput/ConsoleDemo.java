package userinput;

public class ConsoleDemo {

	public static void main(String[] args) {

		// Note that this program does not work on IDEs as System.console() may require console
		
		String name = System.console().readLine();
		System.out.println(name);

	}
}

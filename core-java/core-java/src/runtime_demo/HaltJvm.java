package runtime;

public class HaltJvm {

	public static void main(String[] args) {
		System.out.println("hello ..");
		
		Runtime.getRuntime().halt(0);
		System.out.println("java ");
	}
}

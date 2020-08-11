package runtime;

public class StopeExecution {

	public static void main(String[] args) {
		
		
		Runtime runtime=Runtime.getRuntime();
		System.out.println("stop application..");
		runtime.exit(0);
		
		System.out.println("still Running application..");

	}
}

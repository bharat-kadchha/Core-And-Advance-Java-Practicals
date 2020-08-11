package runtime;

public class JVMInfo {

	public static void main(String[] args) {
		
		Runtime runtime=Runtime.getRuntime();
		System.out.println("availble Processor =" + runtime.availableProcessors());
		System.out.println("free memory inside JVM = "+runtime.freeMemory());
		System.out.println("max memory inside JVM = "+runtime.maxMemory());
		System.out.println("total memory inside JVM = " + runtime.totalMemory());
	}
}

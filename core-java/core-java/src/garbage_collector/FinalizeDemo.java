package garbage_collector;

public class FinalizeDemo {
	public static void main(String[] args) {

		System.out.println("hello");

		System.gc();

		System.out.println("end of Sting");

		FinalizeDemo finObj = new FinalizeDemo();
		finObj = null;
		System.gc();
		System.out.println("end of main");
	}

	public void finalize() {
		System.out.println("finalize method");
	}

}

package garbage_collector;

public class FinalizeDemo2 {

	static FinalizeDemo2 f;

	public static void main(String[] args) throws InterruptedException {

		FinalizeDemo2 obj1 = new FinalizeDemo2();

		System.out.println(obj1.hashCode());

		// nullable obj are eligible to gc.
		obj1 = null;
		System.gc();
		Thread.sleep(1000);

		System.out.println(f.hashCode());

		f = null;
		// obj eligible for gc 2 times but gc calls finalize() only ones time ,,this is
		// proof
		System.gc();
		Thread.sleep(1000);

		System.out.println("end of main");

	}

	// gc calls finalize method
	public void finalize() {
		System.out.println("finalize method");
		f = this;
	}

}

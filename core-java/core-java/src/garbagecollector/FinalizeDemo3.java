package garbagecollector;

// after 10000 obj create there is some memory problem then  jvm->gc->finalize()
// here some obj destroy and memory problem resolve.
// here 10000 obj eligible. but there is no guarantee to  gc destroy all obj .its vary jvm to jvm

public class FinalizeDemo3 {
	static int c = 0;

	public static void main(String[] args) {

		for (int i = 0; i < 10000; i++) {
			FinalizeDemo3 obj = new FinalizeDemo3();

			obj = null;

		}
	}

	// this method call by GC internally
	public void finalize() {
		System.out.println("finalize method call" + ++c);
	}

}

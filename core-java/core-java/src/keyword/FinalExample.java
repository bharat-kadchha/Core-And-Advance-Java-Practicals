package keyword;

//final class cannot be extended.
class DemoClass1 {
	// here final method can not be override .
	void show() {
		System.out.println("superclass");
	}
}

class DemoClass2 extends DemoClass1 {
	void show() {
		System.out.println("subclass");
	}
}

public class FinalExample {

	final int value = 10;

	void change() {

		 value=100;			// not allowed
		 int value=100;		//allowed
		System.out.println(value);
	}

	public static void main(String[] args) {

		FinalExample obj = new FinalExample();
		obj.change();

		DemoClass2 demo = new DemoClass2();
		demo.show();

	}

} // final keyword used to prevent method overriding and also inheritance

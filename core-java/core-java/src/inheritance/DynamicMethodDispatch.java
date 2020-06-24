package inheritance;

class FristClass {
	void method() {
		System.out.println("Inside FristClass's m1 method");
	}
}

class SecondClass extends FristClass {
	// overriding method()
	void method() {
		System.out.println("Inside SecondClass's m1 method");
	}
}

class ThirdClass extends FristClass {
	// overriding method()
	void method() {
		System.out.println("Inside ThirdClass's m1 method");
	}
}

// Driver class 
class DynamicMethodDispatch {
	public static void main(String args[]) {
		// object of type FristClass
		FristClass FristClass = new FristClass();

		// object of type B
		SecondClass secondClass = new SecondClass();

		// object of type ThirdClass
		ThirdClass ThirdClass = new ThirdClass();

		// obtain FristClass reference of type FristClass
		FristClass ref;

		// ref refers to an FristClass object
		ref = FristClass;

		// calling FristClass's version of method()
		ref.method();

		// now ref refers to FristClass B object
		ref = secondClass;

		// calling B's version of method()
		ref.method();

		// now ref refers to FristClass ThirdClass object
		ref = ThirdClass;

		// calling ThirdClass's version of method()
		ref.method();
	}
}

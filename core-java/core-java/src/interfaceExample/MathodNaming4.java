package interfaceExample;

interface AInterface {
	void show();
}

interface BInterface {
	int show();

}

abstract class DemoClass implements AInterface, BInterface {
	public int show() {
		System.out.println("first interface");
	}

}

//Overriding method same name but no return type	// return type conflict

class DemoSubClass extends DemoClass { // ERROR IN CODE.
	public void show() {

		System.out.println("second interfaces");
	}
}

public class MathodNaming4 {

	public static void main(String[] args) {

	}

}

package leb_1;

interface LeftInterface {
	void show();
}

interface RightInterface {
	void show();
}

class MyClass implements LeftInterface, RightInterface {

	public void show() // return type,,name is same then implements only ones
	{
		System.out.println("interface methods");
	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {

		MyClass myClass = new MyClass();
		myClass.show();
	}

}

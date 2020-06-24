package leb_1;

interface MyInterface {

	final int a = 200;

	public void show();
}

public class InterfaceDemo implements MyInterface {

	public void show() {
		System.out.println("interface is implimented");
	}

	public static void main(String[] args) {

		InterfaceDemo interfaceDemo = new InterfaceDemo();
		interfaceDemo.show();
		System.out.println(a);
	}

}

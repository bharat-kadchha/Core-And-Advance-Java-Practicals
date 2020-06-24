package interfaceExample;

interface MyInterface {
	void method1();

	void method2();

	void method3();
}

//Programmer wants to perform only method3 method.then he is doing empty implementation all method. then perform any method.

abstract class ClassDemo implements MyInterface {
	public void method1() {
	}

	public void method2() {
	}

	public void method3() {
	}
}

class ClassDemo2 extends ClassDemo {
	public void method3() {
		System.out.println("method3 method implimented");
	}
}

public class AdepterClass {

	public static void main(String[] args) {
		ClassDemo2 classDemo = new ClassDemo2();
		classDemo.method3();
	}

}

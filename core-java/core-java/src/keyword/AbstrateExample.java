package keyword;

abstract class Class1 {
	// abstract class contain abstract method. Contain both declaration or definition of method.
	
	abstract void method1(int a);

	void method2() // final also
	{
		System.out.println("m2 method");
	}

}

class Class2 extends Class1 {
	void method1(int a) {
		System.out.println("abstrate method =" + a);
	}
}

public class AbstrateExample {

	public static void main(String[] args) {

		Class2 class2 = new Class2();
		class2.method1(20);
	}

}

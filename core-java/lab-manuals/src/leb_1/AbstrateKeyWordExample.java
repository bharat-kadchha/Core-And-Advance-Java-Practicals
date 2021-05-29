package leb_1;

abstract class ParentClass {

	abstract void method1(int a);

	void method2() // final also
	{
		System.out.println("method2 method");
	}

}

class ChildClass extends ParentClass {
	void method1(int a) {
		System.out.println("abstrate method =" + a);
	}
}

public class AbstrateKeyWordExample{

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.method1(20);
	}

}

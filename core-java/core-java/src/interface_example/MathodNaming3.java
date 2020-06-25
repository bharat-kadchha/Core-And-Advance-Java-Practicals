package interfaceExample;

interface SuperInterface1 {
	void show();
}

interface SuberInterface2 {
	int show();
}

class MyClass implements SuperInterface1, SuberInterface2 {
	public void show() {
		System.out.println("super interface methods");
	} // ERROR IN THIS CODE.

	public int show() // within the class same name of method not allowed
	{
		System.out.println(" sub interface methods");
		return 0;
	}
}

public class MathodNaming3 {

	public static void main(String[] args) {

	}

}

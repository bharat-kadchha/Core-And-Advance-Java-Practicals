package interfaceExample;

interface LeftInterface {
	void show();
}

interface RightInterface {
	void show();
}

class ImplimentedClass implements LeftInterface, RightInterface {
	public void show() // return type,,name is same then implements only ones
	{
		System.out.println("interface methods");
	}
}

public class MathodNaming1 {

	public static void main(String[] args) {

		ImplimentedClass imClass = new ImplimentedClass();
		imClass.show();
	}

}

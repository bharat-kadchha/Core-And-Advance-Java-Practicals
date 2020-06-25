package interfaceExample;

interface left1 {
	void show();
}

interface right1 {
	void show(int i);
}

class FristClass implements left1, right1 {
	public void show() // return type,,name is same then implements only ones
	{
		System.out.println("left interface methods");
	}

	public void show(int i) {
		System.out.println("right interface methods with value=" + i);
	}
}

public class MathodNaming2 {
	public static void main(String[] args) {

		FristClass fristClass = new FristClass();
		fristClass.show();
		fristClass.show(10);
	}

}

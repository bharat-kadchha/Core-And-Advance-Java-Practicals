package interface_example;

interface Testinterface1 {
	int x = 100;
}

interface Testinterface2 {
	int y = 200;
}

public class VariableNaming implements Testinterface1, Testinterface2 {

///	 reference is ambiguous

	void show() {
		System.out.println(Testinterface1.x);
		System.out.println(Testinterface2.y);
	}

	public static void main(String[] args) {
		VariableNaming vNaming = new VariableNaming();
		vNaming.show();

	}
}

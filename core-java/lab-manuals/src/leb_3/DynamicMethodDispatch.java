package leb_3;

class FristClass {
	void display() {
		System.out.println("FristClass class");
	}
}

class SecondClass extends FristClass {
	void display() {
		System.out.println("secondClass class");
	}
}

class ThirdClass extends FristClass {
	void display() {
		System.out.println("thirdClass class");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {

		FristClass fristClass = new FristClass();
		SecondClass secondClass = new SecondClass();
		ThirdClass thirdClass = new ThirdClass();

		FristClass ref;
		ref = fristClass;
		ref.display();

		ref = secondClass;
		ref.display();

		ref = thirdClass;
		ref.display();

	}
}

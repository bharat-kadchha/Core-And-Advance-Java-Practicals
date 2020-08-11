package extra;

public class ConstructorChainingForFinal {

	final int i;

	ConstructorChainingForFinal(int x) {
		i = x;
	}

	ConstructorChainingForFinal() {
		// chaining..
		this(100);
	}

	public static void main(String[] args) {

		ConstructorChainingForFinal forFinal = new ConstructorChainingForFinal();
		System.out.println(forFinal.i);
		ConstructorChainingForFinal forFinal2 = new ConstructorChainingForFinal(200);
		System.out.println(forFinal2.i);
	}
}

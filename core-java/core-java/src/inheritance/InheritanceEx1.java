package inheritance;

class superclass {
	int i, j;

	void put() {
		System.out.println("i and j= " + i + " and " + j);
	}
}

class subclass extends superclass {
	int k;

	void putk() {
		System.out.println("k= " + k);
	}

	void sum() {
		System.out.println("sum=" + (i + j + k));
	}

}

public class InheritanceEx1 {

	public static void main(String[] args) {

		superclass superClass = new superclass();
		subclass subClass = new subclass();
		superClass.i = 10;
		superClass.j = 20;
		subClass.k = 30;

		superClass.put();
		subClass.putk();
		subClass.sum();

		subClass.i = 10;
		subClass.j = 20;
		subClass.k = 30;
		subClass.sum();

	}

}

package leb_1;

class SuperClass {
	int i, j;

	void put() {
		System.out.println("i and j= " + i + " and " + j);
	}
}

class SubClass extends SuperClass {

	void sum() {
		System.out.println("sum=" + (i + j));
	}

}

public class Inheritance {

	public static void main(String[] args) {

		SubClass subClass = new SubClass();
		subClass.i = 10;
		subClass.j = 20;

		subClass.put();
		subClass.sum();

	}

}

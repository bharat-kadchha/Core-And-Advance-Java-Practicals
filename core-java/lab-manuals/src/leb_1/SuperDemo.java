package leb_1;

class Animal {
	String color = "white";

	Animal() {
		System.out.println("animal created");
	}

	void type() {
		System.out.print("animal type =");
	}
}

class Dog extends Animal {
	String color = "black";

	Dog() {
		super(); // for superclass constructor
		System.out.println("dog created");
	}

	void put() {
		System.out.println(color);
		System.out.println(super.color); // superclass variable
	}

	void name() {
		super.type(); // for superclass method
		System.out.print("dog");
	}
}

public class SuperDemo {

	public static void main(String[] args) {

		System.out.println("1 = constructor");
		Dog dog = new Dog();
		System.out.println("2 = instance variable");
		dog.put();
		System.out.println("3 = instance method");
		dog.name();

	}

}

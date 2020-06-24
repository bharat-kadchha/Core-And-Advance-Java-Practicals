package langPackageExample;

class Cat

{
	int j;

	Cat(int j) {
		this.j = j;
	}
}

class Dog implements Cloneable {
	Cat cat;
	int i;

	Dog(Cat cat, int i) {
		this.cat = cat;
		this.i = i;
	}

	public Object clone() throws CloneNotSupportedException {
		Cat cat1 = new Cat(cat.j);
		Dog dog2 = new Dog(cat1, i);
		return dog2;

	}

}

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Cat cat = new Cat(20);
		Dog dog1 = new Dog(cat, 10);

		System.out.println("for dog1==" + dog1.i + "...." + dog1.cat.j);
		Dog dog2 = (Dog) dog1.clone();

		dog2.i = 100;
		dog2.cat.j = 200;

		System.out.println("for dog2==" + dog2.i + "...." + dog2.cat.j);
		System.out.println("for dog1==" + dog1.i + "...." + dog1.cat.j);
	}
}

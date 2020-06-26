package lang_package;

class Student

{
	int j;

	Student(int j) {
		this.j = j;
	}
}

class Child implements Cloneable {
	Student std;
	int i;

	Child(Student std, int i) {
		this.std = std;
		this.i = i;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

}

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student student = new Student(20);
		Child child1 = new Child(student, 10);

		System.out.println("for d1==" + child1.i + "...." + child1.std.j);
		Child child2 = (Child) child1.clone();

		child2.i = 100;
		child2.std.j = 200;

		System.out.println("for d2==" + child2.i + "...." + child2.std.j);
		System.out.println("for d1==" + child1.i + "...." + child1.std.j);
	}
}

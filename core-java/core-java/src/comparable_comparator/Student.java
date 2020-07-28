package comparable_comparator;

//every class have implement comparable if we want to sort them
public class Student implements Comparable<Student> {

	private String name;
	private int std;
	private int grade;

	public Student(String name, int std, int grade) {

		this.name = name;
		this.std = std;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", std=" + std + ", grade=" + grade + "]";
	}

	@Override
	public int compareTo(Student std) {

		if (this.grade > std.grade)
			return 1; // any positive value
		else
			return -1;

	}

}

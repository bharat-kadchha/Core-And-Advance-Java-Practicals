package enumDemo;

enum Student {
	NAME, CITY, ENROLL;
}

public class EnumDemo2 {

	public static void main(String[] args) {

		Student[] students = Student.values();

		for (Student student : students) {
			System.out.println(student.name() + " at index " + student.ordinal());
		}

	}
}

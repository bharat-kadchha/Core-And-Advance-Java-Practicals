package com;

public class StudentCrud {

	public static void insertStudent(StudentService stdService) {

		StudentModel student = new StudentModel();
		student.setName("ramesh");
		student.setCity("kutiyana");
		student.setPinCode(456123);
		student.setSalary(52000);
		stdService.insertStudent(student);

	}

	public static void getStudentById(StudentService stdService, int id) {

		stdService.getStudentById(id);
	}

	public static void deleteStudentById(StudentService stdService, int id) {
		stdService.deleteStudentById(id);

	}

	public static void updatedentById(StudentService stdService, int id, int salary) {

		stdService.updatedentById(id, salary);
	}

}

package com;

public class MainApp {
	public static void main(String[] args) {

		StudentService stdService = new StudentServiceImpl();

		StudentCrud.insertStudent(stdService);
		StudentCrud.getStudentById(stdService, 1);

		StudentCrud.updatedentById(stdService, 1, 00000);

		StudentCrud.deleteStudentById(stdService, 1);
	}
}

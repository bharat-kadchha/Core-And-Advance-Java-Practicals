package com;

public class StudentServiceImpl implements StudentService {

	public void insertStudent(StudentModel std) {

		new StudentDAOImpl().insertStudent(std);
	}

	public StudentModel getStudentById(int id) {
		return new StudentDAOImpl().getStudentById(id);
	}

	public void updatedentById(int id, int salary) {
		new StudentDAOImpl().updatedentById(id, salary);

	}

	public void deleteStudentById(int id) {
		new StudentDAOImpl().deleteStudentById(id);

	}

}

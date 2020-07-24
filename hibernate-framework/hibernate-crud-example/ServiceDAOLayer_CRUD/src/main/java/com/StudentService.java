package com;

public interface StudentService {

	public abstract void insertStudent(StudentModel std);

	public abstract StudentModel getStudentById(int id);

	public abstract void updatedentById(int id, int salary);

	public abstract void deleteStudentById(int id);

}

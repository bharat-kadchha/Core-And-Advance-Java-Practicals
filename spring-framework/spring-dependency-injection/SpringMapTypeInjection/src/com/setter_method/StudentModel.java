package com.setter_method;

import java.util.Map;

public class StudentModel {

	private String name;
	private int rollNo;

	private Map<String, String> books;

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setBooks(Map<String, String> books) {
		this.books = books;
	}

	public void stdDetails() {
		System.out.println("setter injection");
		System.out.println("student name = " + name);
		System.out.println("student rollNo = " + rollNo);

		System.out.println("books = " + books);
	}

}

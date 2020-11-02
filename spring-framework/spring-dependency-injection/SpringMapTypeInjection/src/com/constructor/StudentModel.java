package com.constructor;

import java.util.Map;

public class StudentModel {

	private String name;
	private int rollNo;

	private Map<String, String> books;

	public StudentModel(String name, int rollNo, Map<String, String> books) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.books = books;
	}

	public void stdDetails() {
		System.out.println("constructor injection");
		System.out.println("student name = " + name);
		System.out.println("student rollNo = " + rollNo);

		System.out.println("books = " + books);
	}

}

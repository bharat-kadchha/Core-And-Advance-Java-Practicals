package com.costructor;

import java.util.ArrayList;

public class StudentModel {

	private String name;
	private int rollNo;

	private ArrayList<BooksModel> books;

	public StudentModel(String name, int rollNo, ArrayList<BooksModel> books) {
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

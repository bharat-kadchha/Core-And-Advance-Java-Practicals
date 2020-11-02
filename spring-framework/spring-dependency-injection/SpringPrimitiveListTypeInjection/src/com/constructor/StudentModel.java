package com.constructor;

import java.util.List;

public class StudentModel {

	private String name;
	private int rollNo;
	
	private List<String> books;

	public StudentModel(String name, int rollNo, List<String> books) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.books = books;
	}
	public void  stdDetails()
	{
		System.err.println("constructor injection");
		System.out.println("student name = "+name);
		System.out.println("student rollNo = "+rollNo);
		 
		System.out.println("books = "+books);
		
	}
	
	
}

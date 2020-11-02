package com.setter_method;

public class BooksModel {

	String name;
	int prize;

	public BooksModel(String name, int prize) {

		this.name = name;
		this.prize = prize;
	}

	@Override
	public String toString() {
		return name + "," + prize;
	}

}

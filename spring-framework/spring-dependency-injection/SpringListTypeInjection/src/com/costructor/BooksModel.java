package com.costructor;

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

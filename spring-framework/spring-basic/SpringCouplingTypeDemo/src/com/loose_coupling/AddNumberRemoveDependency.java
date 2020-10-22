package com.loose_coupling;

class Calculate {

	// here,control of method is not depended.
	public void add(int a, int b, int c) {

		System.out.println((a + b + c));
	}

}

public class AddNumberRemoveDependency {

	public static void main(String[] args) {

		Calculate cal = new Calculate();

		cal.add(10, 20, 30);
	}

}

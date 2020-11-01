package com.constructor;

public class CarModel {

	String color;
	String company;

	public CarModel(String color, String company) {
		this.color = color;
		this.company = company;
		System.out.println("i m constructor of car");
	}

	public void showDetails() {
		System.out.println("color--" + this.color +"--company--"+this.company);
	}
}

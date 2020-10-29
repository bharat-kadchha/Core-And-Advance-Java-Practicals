package com.constructor;

public class CarModel {

	String color;

	//inject dependency.
	public CarModel(String color)
	{
		this.color=color;
		System.out.println("i m constructor of car");
	}
	
	public void showColor() {
		System.out.println("Car color is=" + color);
	}
}

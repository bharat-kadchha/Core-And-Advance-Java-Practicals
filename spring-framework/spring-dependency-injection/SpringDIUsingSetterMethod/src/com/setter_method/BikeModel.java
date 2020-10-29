package com.setter_method;

public class BikeModel {
	
	String color;
	
	public BikeModel(){
		System.out.println("i m constructor of bike");
	}
	
	public void setColor(String color){
		this.color=color;
		System.out.println("i m setter method of bike");
	}
	public void showColor(){
		System.out.println("Bike color is = "+color);
	}
	
}

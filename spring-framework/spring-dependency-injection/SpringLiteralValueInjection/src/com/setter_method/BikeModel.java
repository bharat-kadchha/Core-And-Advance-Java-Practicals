package com.setter_method;

public class BikeModel {

	String color;
	String company;
	int prize;

	public BikeModel() {
		System.out.println("i m constructor of bike");
	}

	public void setColor(String color) {
		this.color = color;
		System.out.println("i m setter method of bike");
	}
	

	public void setCompany(String company) {
		this.company = company;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public void showDetails() {
		System.out.println("color--" + this.color+"--company--" + this.company+"--prize--" + this.prize); 

		
	}

}

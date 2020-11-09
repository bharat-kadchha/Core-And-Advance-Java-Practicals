package com.factory_method;

public class CarModel {

	public CarModel() {
		System.out.println("i m constructor of car");
	}

	// static factory method
	public static CarModel getCar() {
		System.out.println("car static factory method");
		return new CarModel();
	}

	public void run() {
		System.out.println("Car run..");
	}
}

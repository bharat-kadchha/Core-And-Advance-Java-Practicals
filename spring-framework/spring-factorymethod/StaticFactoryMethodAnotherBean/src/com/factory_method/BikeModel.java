package com.factory_method;

public class BikeModel implements Engine {

	public BikeModel() {
		System.out.println("i m constructor of Bike");
	}

	public void start() {

		System.out.println("Bike is started....");

	}
}

package com.factory_method;

public class TruckModel implements Engine {

	public TruckModel() {
		System.out.println("i m constructor of truck");
	}

	public void start() {

		System.out.println("truck is started....");

	}
}

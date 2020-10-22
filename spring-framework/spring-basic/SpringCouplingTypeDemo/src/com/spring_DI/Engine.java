package com.spring_DI;

public interface Engine {

	public void start();
}

class Car implements Engine {

	public void start() {

		System.out.println("car has been started...");

	}

}

class Bike implements Engine {

	public void start() {

		System.out.println("Bike has been started...");

	}
}

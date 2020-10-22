package com.tight_coupling;

public interface Engine {

	public void start();
}

class Bike implements Engine{

	public void start() {

		System.out.println("Bike has been started...");

	}
}
class Car implements Engine {

	public void start() {

		System.out.println("car has been started...");

	}

}


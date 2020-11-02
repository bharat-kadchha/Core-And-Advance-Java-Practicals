package com.constructor;

public class CarModel {

	EngineService engine;

	public CarModel(EngineService engine) {
		this.engine = engine;
		System.out.println("i m constructor of car");
	}

	public void engineStart() {
		if (engine != null) {
			System.out.print("Car ");
			engine.start();
		} else
			System.err.print("engine not start...");
	}
}

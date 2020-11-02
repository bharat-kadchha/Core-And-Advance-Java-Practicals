package com.setter_method;

import com.constructor.EngineService;

public class BikeModel {
	
	String color;
	EngineService engine;
	
	public BikeModel()
	{
		System.out.println("i m conctructor of bike");
	}
	
	public void setColor(String color)
	{
		this.color=color;
		//System.out.println("i m setter method");
	}
	
	public void setEngine(EngineService engine) {
		this.engine = engine;
	}

	public void engineStart() {
		if (engine != null) {
			System.out.print("Bike ");
			engine.start();
		} else
			System.err.print("engine not start...");
	}
	
}

package com.loose_coupling;

class Key {

	Engine engine;

	// here,we can't instantiate object directly.
	// constructor injection
	public Key(Engine engine) {
		this.engine = engine;
		engine.start();
	}

}

public class MainApp {

	public static void main(String[] args) {

		Engine engineOf = new Car();
		Key newKey = new Key(engineOf);

	}

}
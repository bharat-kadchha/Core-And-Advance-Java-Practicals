package com.factory_method;

public class VehicalFactory {

	public static Engine getVehicalFactory() {
		System.out.println("vehical static factory method");
		return new BikeModel();

	}

}

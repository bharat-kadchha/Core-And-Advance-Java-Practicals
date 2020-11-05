package com.factory_method;

public class VehicalFactory {

	public Engine getVehicalFactory() {
		System.out.println("vehical non-static factory method");
		return new TruckModel();

	}

}

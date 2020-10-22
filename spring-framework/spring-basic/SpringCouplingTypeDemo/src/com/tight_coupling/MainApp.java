package com.tight_coupling;


class StartVehical
{
	//if we want to start bike ,then instantiate object of bike
	public void run() {
		Car car =new Car();
		car.start();
	}
}


public class MainApp {
	public static void main(String[] args) {
		
		//here ,only car will start,
		StartVehical start =new StartVehical();
		start.run();
		
	}

}

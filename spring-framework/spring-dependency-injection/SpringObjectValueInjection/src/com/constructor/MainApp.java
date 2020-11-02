package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("MyBean.xml");
		CarModel car = (CarModel) ac.getBean("car");
		car.engineStart();
		
		
		CarModel car1 = (CarModel) ac.getBean("car1");
		car1.engineStart();
	}
}

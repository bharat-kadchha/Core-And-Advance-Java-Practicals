package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.setter_method.BikeModel;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("MyBean.xml");

		// constructor
		CarModel car = (CarModel) ac.getBean("car");
		car.showDetails();

	}
}

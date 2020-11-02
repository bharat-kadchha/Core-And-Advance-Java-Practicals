package com.setter_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {

		
		ApplicationContext ac = new ClassPathXmlApplicationContext("MyBean.xml");
		// here we can define bean id .
		BikeModel bike = (BikeModel) ac.getBean("bike");
		bike.engineStart();
		
		BikeModel bike1 = (BikeModel) ac.getBean("bike");
		bike1.color="yellow";
		bike1.engineStart();
		
		BikeModel bike2 = new BikeModel();
		bike2.engineStart();  //not inject engine
		
		
		
	}
}

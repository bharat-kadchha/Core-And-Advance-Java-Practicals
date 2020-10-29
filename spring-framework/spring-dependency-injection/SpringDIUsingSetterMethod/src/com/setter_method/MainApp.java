package com.setter_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {

		
		ApplicationContext ac = new ClassPathXmlApplicationContext("MyBean.xml");
		BikeModel bike = (BikeModel) ac.getBean("bikeSetter");

		bike.showColor();

	}
}

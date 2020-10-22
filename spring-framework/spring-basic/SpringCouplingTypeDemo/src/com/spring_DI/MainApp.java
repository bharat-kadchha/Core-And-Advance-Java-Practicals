package com.spring_DI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("MyBean.xml"));

		// here ,object creation done by IOC container.this is fully loosely
		// coupled app.
		Car myCar = (Car) factory.getBean("car");
		myCar.start();

		Bike myBike = (Bike) factory.getBean("bike");
		myBike.start();

	}
}
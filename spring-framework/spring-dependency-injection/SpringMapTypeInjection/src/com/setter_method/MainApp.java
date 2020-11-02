package com.setter_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("MyBean.xml");

		// setter method
		StudentModel student1 = (StudentModel) ac.getBean("student1");
		student1.stdDetails();
	}
}

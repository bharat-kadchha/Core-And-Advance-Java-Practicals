package com.costructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("MyBean.xml");

		// constructor
		StudentModel student = (StudentModel) ac.getBean("student");
		student.stdDetails();
	}
}

package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("MyBean.xml");
		HelloSpring firstApp = (HelloSpring) ac.getBean("helloWorld");
		firstApp.getMessage();
		
		
	}
}

package com.factory_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("MyBean.xml");
		Engine MyEngine = (Engine) ac.getBean("vehical");
		MyEngine.start();
		
	}
}

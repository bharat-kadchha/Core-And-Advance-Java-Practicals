package com.bean_factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String[] args) {

		
		ApplicationContext acx = new ClassPathXmlApplicationContext("MyBean.xml");
		HelloSpring  firstApp = (HelloSpring) acx.getBean("helloWorld");
		firstApp.getMessage();
		
	
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("MyBean.xml"));
		HelloSpring secondApp = (HelloSpring) factory.getBean("helloWorld");
		secondApp.getMessage();
		
	}
}

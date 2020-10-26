package com.application_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		// specified system path of XML file.
		ApplicationContext fileXmlCtx = new FileSystemXmlApplicationContext("../ApplicationContextContainer/src/MyBean.xml");
		HelloSpring firstObject = (HelloSpring) fileXmlCtx.getBean("helloWorld");
		firstObject.getMessage();

		// no need to specified full path
		ApplicationContext classPathCtx = new ClassPathXmlApplicationContext("MyBean.xml");
		HelloSpring secondObject = (HelloSpring) classPathCtx.getBean("helloWorld");
		secondObject.getMessage();

	}
}

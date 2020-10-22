package com.spring_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Calculate {

	int a, b, c;

	public Calculate(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getSum() {
		return (a + b + c);
	}

}

public class AddNumberRemoveDependency {

	public static void main(String[] args) {

		// this is fully loosely coupled app.
		ApplicationContext acx = new ClassPathXmlApplicationContext(
				"MyBean.xml");
		Calculate MyCalculator = (Calculate) acx.getBean("calculator");
		int sum = MyCalculator.getSum();
		System.out.println("total sum = " + sum);
	}

}

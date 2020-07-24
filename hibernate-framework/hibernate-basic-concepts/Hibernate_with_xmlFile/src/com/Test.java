package com;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		try {
			Session session = null;
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			session = sf.openSession();
			session.beginTransaction();
			Student student1 = new Student();
			student1.setId(1);
			student1.setName("morgan");
			student1.setCity("australia");

			session.save(student1);
			session.getTransaction().commit();
			System.out.println("student save");
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

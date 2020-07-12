package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();

			StudentModel student1 = new StudentModel();
			student1.setName("anil");
			student1.setCity("UP");
			student1.setEnroll(001);
			student1.setStd(12);

			session.save(student1);

			session.getTransaction().commit();

			HibernateUtils.closeSessionfactory();

		}

	}
}

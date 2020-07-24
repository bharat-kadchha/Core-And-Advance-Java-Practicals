package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class SimpleBatchInsertion {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();
			for (int i = 1; i < 100; i++) {

				// every time create connection and store single single object in to database.
				StudentModel student1 = new StudentModel();
				student1.setName("anil" + i);
				student1.setCity("UP" + i);
				student1.setEnroll(001);
				student1.setStd(12);
				session.save(student1);

			}
			session.getTransaction().commit();

			HibernateUtils.closeSessionfactory();

		}

	}
}

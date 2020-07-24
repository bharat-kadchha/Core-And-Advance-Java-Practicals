package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class BatchInsertionDemo {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();
			int batchSize = 5;
			for (int i = 1; i < 100; i++) {

				StudentModel student1 = new StudentModel();
				student1.setName("anil" + i);
				student1.setCity("UP" + i);
				student1.setEnroll(001);
				student1.setStd(12);
				session.save(student1);

				if (i > 1 & i % batchSize == 0) {

					System.out.println("flush nad clear session");

					// to insert all data which session object have.
					session.flush();

					// clean all the data keeping by session in frist level cache.
					session.clear();
				}

			}
			session.getTransaction().commit();

			HibernateUtils.closeSessionfactory();

		}

	}
}

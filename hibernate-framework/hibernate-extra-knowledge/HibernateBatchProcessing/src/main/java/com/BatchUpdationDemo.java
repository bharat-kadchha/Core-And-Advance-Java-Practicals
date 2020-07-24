package com;

import org.hibernate.CacheMode;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;

import utils.HibernateUtils;

public class BatchUpdationDemo {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();
			int batchSize = 5;

			ScrollableResults results = session.createQuery("select s from Student s").setCacheMode(CacheMode.IGNORE)
					.scroll(ScrollMode.FORWARD_ONLY);

			int count = 1;
			while (results.next()) {
				StudentModel student = session.get(StudentModel.class, count);

				student.setEnroll(count + 4);
				student.setStd(count);

				// every time 5 records then session is flush and clear.
				if (++count % batchSize == 0) {

					System.out.println("flush and clear session");

					// to insert all data which session object have.
					session.flush();

					// clean all the data keeping by session in first level cache.
					session.clear();
				}

			}
			session.getTransaction().commit();

		}

	}
}

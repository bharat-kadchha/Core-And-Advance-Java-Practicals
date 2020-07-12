package com;

import org.hibernate.Criteria;
import org.hibernate.Session;

import utils.HibernateUtils;

public class PaginationDemo {

	public static void paginationResult() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			Criteria criteria = session.createCriteria(StudentModel.class);
			// get result from id 6 to 10
			criteria.setFirstResult(5);
			criteria.setMaxResults(10);

			System.out.println(criteria.list());

			session.beginTransaction().commit();
		}
	}
}

package com;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

public class IsNullQuery {

	public static void nullQuery() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String hql = "from Student s where s.book is null"; // its return student which have not a book.(means books
																// =null)

			Query list = session.createQuery(hql);
			System.out.println(list.list());

		}
	}

}

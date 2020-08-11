package com;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

public class OrderByQuery {

	public static void orderByQuery() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String hql = "from Student s order by s.enroll DESC ,s.std ASC"; // default is ASC

			Query list = session.createQuery(hql);
			System.out.println(list.list());

		}
	}

}

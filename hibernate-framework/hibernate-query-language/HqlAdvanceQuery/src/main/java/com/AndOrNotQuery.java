package com;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

public class AndOrNotQuery {

	public static void andQuery() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			String hql = "from Student s where s.enroll=2 and s.city='gujarat'";

			Query list = session.createQuery(hql);
			System.out.println(list.list());

		}

	}

	public static void orQuery() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String hql = "from Student s where s.enroll=2 or s.city='gujarat'";

			Query list = session.createQuery(hql);
			System.out.println(list.list());

		}
	}

	public static void notQuery() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String hql = "from Student s where (s.city='gujarat' or s.city='MP') and not s.enroll=2";

			Query list = session.createQuery(hql);
			System.out.println(list.list());

		}
	}
}

package com;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

import utils.HibernateUtils;

public class JoinQueryDemo {

	public static void joinQueryResult() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			Criteria criteria = session.createCriteria(StudentModel.class, "std");
			criteria.createAlias("std.bag", "bag");
			criteria.addOrder(Order.desc("bag.prize"));
			System.out.println(criteria.list());

			Criteria criteria1 = session.createCriteria(StudentModel.class, "std");

			criteria1.createAlias("std.bag", "bag");
			criteria1.setProjection(Projections.sum("bag.prize"));

			System.out.println(criteria1.list());

			session.beginTransaction().commit();
		}
	}

}

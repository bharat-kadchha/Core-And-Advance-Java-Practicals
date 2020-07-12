package com;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import utils.HibernateUtils;

public class SortingDemo {
	public static void sortingResult() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			Criteria criteria = session.createCriteria(StudentModel.class);
			criteria.add(Restrictions.ge("stipand", 10000));

			criteria.addOrder(Order.asc("stipand"));

			// criteria.addOrder(Order.desc("name"));

			System.out.println(criteria.list());

			session.beginTransaction().commit();
		}
	}
}

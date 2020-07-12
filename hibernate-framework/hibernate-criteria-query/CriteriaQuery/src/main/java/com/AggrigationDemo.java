package com;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import utils.HibernateUtils;

public class AggrigationDemo {

	public static void AggrigationResult() {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			Criteria criteria = session.createCriteria(StudentModel.class);

			System.out.println(criteria.setProjection(Projections.rowCount()).list());
			System.out.println(criteria.setProjection(Projections.count("id")).list());

			System.out.println(criteria.setProjection(Projections.avg("stipand")).list());

			System.out.println(criteria.setProjection(Projections.max("stipand")).list());

			session.beginTransaction().commit();

		}
	}
}

package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import utils.HibernateUtils;

public class GroupByDemo {

	public static void groupbyResult() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			Criteria criteria = session.createCriteria(StudentModel.class);

			// select s_city,count(*) as from student_records group by s_city;
			criteria.setProjection(
					Projections.projectionList().add(Projections.groupProperty("city")).add(Projections.rowCount()));

			List<Object[]> list = criteria.list();

			for (Object[] obj : list) {
				System.out.println(obj[0] + "--" + obj[1]);
			}

			session.beginTransaction().commit();
		}
	}
}

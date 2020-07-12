package com;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import utils.HibernateUtils;

public class CriteriaDemo {
	public static void criteriaQueryResult() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			Criteria criteria = session.createCriteria(StudentModel.class);

			// more than or equal
			System.out.println(criteria.add(Restrictions.ge("stipand", 10000)).list());

			Criteria criteria1 = session.createCriteria(StudentModel.class);
			// more than
			System.out.println(criteria1.add(Restrictions.gt("stipand", 10000)).list());

			Criteria criteria2 = session.createCriteria(StudentModel.class);
			// less than
			System.out.println(criteria2.add(Restrictions.lt("stipand", 10000)).list());

			Criteria criteria3 = session.createCriteria(StudentModel.class);

			System.out.println(criteria3.add(Restrictions.eq("name", "sujal")).list());

			Criteria criteria4 = session.createCriteria(StudentModel.class);
			// get records having name starting with suj.
			System.out.println(criteria4.add(Restrictions.like("name", "suj%")).list());

			Criteria criteria5 = session.createCriteria(StudentModel.class);
			// ilike is case sensitive
			System.out.println(criteria5.add(Restrictions.ilike("name", "Suj%")).list());

			Criteria criteria6 = session.createCriteria(StudentModel.class);
			System.out.println(criteria6.add(Restrictions.between("id", 5, 9)).list());

			Criteria criteria7 = session.createCriteria(StudentModel.class);
			System.out.println(criteria7.add(Restrictions.isNull("stipand")).list());

			Criteria criteria8 = session.createCriteria(StudentModel.class);
			System.out.println(criteria8.add(Restrictions.isNotNull("city")).list());

			Criteria criteria9 = session.createCriteria(StudentModel.class);
			System.out.println(criteria9.add(Restrictions.isEmpty("stipand")));

			Criteria criteria10 = session.createCriteria(StudentModel.class);
			System.out.println(criteria10.add(Restrictions.isNotEmpty("city")));

			// we can used two different criteria using AND or OR

			Criterion name = Restrictions.like("name", "rah%");

			Criterion stipand = Restrictions.gt("stipand", 10000);

			Criteria criteria11 = session.createCriteria(StudentModel.class);

			// name AND stipend
			System.out.println(criteria11.add(Restrictions.and(name, stipand)).list());

			Criteria criteria12 = session.createCriteria(StudentModel.class);

			//// name OR stipend
			System.out.println(criteria12.add(Restrictions.or(name, stipand)).list());

			session.beginTransaction().commit();

		}
	}
}

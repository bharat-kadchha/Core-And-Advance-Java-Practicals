package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

public class GetDataWithHql {

	public static void main(String[] args) {

		getStudentAndBookById(2);
		getStudentAndBookByIdWithHql(2);
	}

	@SuppressWarnings("deprecation")
	public static void getStudentAndBookById(int id) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.beginTransaction();

			String HQL = "from Student s where s.id=?1";
			Query que = session.createQuery(HQL);
			que.setParameter(1, id);

			StudentModel student = (StudentModel) que.uniqueResult();

			System.out.println(student);

			session.getTransaction().commit();
		}

	}

	// get data of columns of student and some column of book
	@SuppressWarnings("deprecation")
	public static void getStudentAndBookByIdWithHql(int id) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.beginTransaction();

			String HQL = "select s.name,s.enroll,b.bName from Student s left join s.book b where s.id=?1";
			Query que = session.createQuery(HQL);
			que.setParameter(1, id);

			List<Object[]> list = que.list();

			for (Object[] obj : list) {
				System.out.println((String) obj[0] + " " + (int) obj[1] + " " + (String) obj[2]);
			}

			session.getTransaction().commit();
		}
	}

}

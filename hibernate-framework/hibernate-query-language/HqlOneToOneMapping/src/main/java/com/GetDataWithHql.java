package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

public class GetDataWithHql {

	public static void main(String[] args) {

		getStudentAndBookByid(1);
		getStudentAndBookByIdWithHql(1);
		getStudentNameAndBookNameByIdWithHql(1);
	}

	// get data using hibernate get() method
	public static void getStudentAndBookByid(int id) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.beginTransaction();

			StudentModel student1 = (StudentModel) session.get(StudentModel.class, id);

			System.out.println(student1);
			BooksModel book1 = student1.getBook();
			System.out.println(book1);

			session.getTransaction().commit();
		}
	}

	// get data using HQl join query
	@SuppressWarnings("deprecation")
	public static void getStudentAndBookByIdWithHql(int id) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.beginTransaction();
			// Student student1 = (Student) session.get(Student.class, id);
			String hql = "from Student s left join fetch s.book where s.id=?1"; // here we are write ...fetch ..bcz in
																				// hibernate 1+n problem

			Query que = session.createQuery(hql);
			que.setParameter(1, id);

			StudentModel student1 = (StudentModel) que.uniqueResult();

			System.out.println(student1);
			BooksModel book1 = student1.getBook();
			System.out.println(book1);

			session.getTransaction().commit();
		}
	}

	// fatch some column from hql query
	public static void getStudentNameAndBookNameByIdWithHql(int id) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.beginTransaction();

			String hql = "select s.name,b.bName from Student s left join s.book b where s.id=?1";

			Query que = session.createQuery(hql);
			que.setParameter(1, id);

			List<Object[]> list = que.list();

			for (Object[] obj : list) {
				System.out.println((String) obj[0]);
				System.out.println((String) obj[1]);
			}

			session.getTransaction().commit();
		}
	}
}

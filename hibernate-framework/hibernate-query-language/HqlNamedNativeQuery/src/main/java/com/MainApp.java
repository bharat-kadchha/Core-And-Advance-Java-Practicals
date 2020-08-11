package com;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			// HQL namedQuery is global ones we define then used in anywhere.
			Query hql = session.getNamedQuery("getStudentById");
			hql.setInteger(1, 2);

			// native query means its work on SQL statement.
			@SuppressWarnings("deprecation")
			StudentModel std = (StudentModel) hql.uniqueResult();

			System.out.println(std);
		}
	}

	public static void addStudent() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student = new StudentModel();
			student.setName("praksh");
			student.setCity("gujrat");
			student.setEnroll(005);
			student.setStd(11);

			BooksModel b1 = new BooksModel();
			b1.setBName("fff");
			b1.setPrize(600);

			student.setBook(b1);
			session.beginTransaction();

			session.save(student);

			session.getTransaction().commit();
		}
	}
}

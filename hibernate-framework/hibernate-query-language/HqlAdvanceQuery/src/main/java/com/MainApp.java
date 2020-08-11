package com;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		addStudent();
		groupBy();

		AndOrNotQuery.andQuery();
		AndOrNotQuery.orQuery();
		AndOrNotQuery.notQuery();

		OrderByQuery.orderByQuery();

		IsNullQuery.nullQuery();

	}

	public static void groupBy() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String hql = "from Student s group by s.std";

			Query list = session.createQuery(hql);
			System.out.println(list.list());

		}
	}

	public static void addStudent() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student1 = new StudentModel();
			student1.setName("praksh");
			student1.setCity("gujrat");
			student1.setEnroll(005);
			student1.setStd(11);

			BooksModel book1 = new BooksModel();
			book1.setBName("fff");
			book1.setPrize(600);

			student1.setBook(book1);
			session.beginTransaction();

			session.save(student1);

			session.getTransaction().commit();
		}

	}
}

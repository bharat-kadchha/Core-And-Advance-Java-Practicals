package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student1 = new StudentModel();
			student1.setName("anil");
			student1.setCity("UP");
			student1.setEnroll(001);
			student1.setStd(12);

			BooksModel book1 = new BooksModel();
			book1.setBName("abcd");
			book1.setPrize(2345);

			student1.setBook(book1);
			session.beginTransaction();

			session.save(student1);

			session.getTransaction().commit();
		}

	}
}

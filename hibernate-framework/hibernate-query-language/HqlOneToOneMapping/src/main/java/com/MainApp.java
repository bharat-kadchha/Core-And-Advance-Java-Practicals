package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.beginTransaction();

			StudentModel student = new StudentModel();
			student.setName("anil");
			student.setCity("UP");
			student.setEnroll(001);
			student.setStd(12);

			BooksModel book1 = new BooksModel();
			book1.setBName("abcd");
			book1.setPrize(2345);

			student.setBook(book1);

			session.save(student);

			session.getTransaction().commit();
		}

	}
}

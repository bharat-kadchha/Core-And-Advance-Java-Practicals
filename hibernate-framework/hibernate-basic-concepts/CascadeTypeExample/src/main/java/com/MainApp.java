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

			BooksModel book = new BooksModel();
			book.setBName("abcd");
			book.setPrize(2345);
			student.setBook(book);
			session.save(student); // save only parent child automatically saved .because cascade type is ALL.

			session.getTransaction().commit();

		}
	}

}

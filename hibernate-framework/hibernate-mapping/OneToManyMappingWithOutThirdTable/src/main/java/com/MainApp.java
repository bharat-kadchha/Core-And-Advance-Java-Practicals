package com;

import java.util.Arrays;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.beginTransaction();

			StudentModel student1 = new StudentModel();
			student1.setName("anil");
			student1.setCity("UP");
			student1.setEnroll(001);
			student1.setStd(12);

			BooksModel book1 = new BooksModel();
			book1.setBName("abcd");
			book1.setPrize(2345);

			BooksModel book2 = new BooksModel();
			book2.setBName("mnop");
			book2.setPrize(500);

			student1.setBook(Arrays.asList(book1, book2));

			session.save(student1);

			session.getTransaction().commit();
		}

	}
}

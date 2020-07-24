package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student1 = new StudentModel();
			student1.setName("anil");
			student1.setCity("UP");
			student1.setStd(12);

			BooksModel book1 = new BooksModel();
			book1.setBName("abcd");
			book1.setPrize(2345);

			BooksModel book2 = new BooksModel();
			book2.setBName("zxcv");
			book2.setPrize(5426);

			BooksModel book3 = new BooksModel();
			book3.setBName("mnop");
			book3.setPrize(200);

			student1.getCollection().add(book1);
			student1.getCollection().add(book2);

			student1.getCollection().add(book3);

			session.save(student1);

			session.beginTransaction().commit();
		}

	}
}

package com;

import java.util.Arrays;

import org.hibernate.Session;

import utils.HibernateUtils;

//@uniqueConstraints -is used to set Constraints on columns.
//columnNames={} define column names on which we have to apply constraint.if at any where constraint violate then hibernate throw Exception.

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
			book2.setBName("abce");
			book2.setPrize(500);

			student1.setBook(Arrays.asList(book1, book2));

			book1.setStudent(student1);
			book2.setStudent(student1);

			session.save(student1);

			session.getTransaction().commit();

		}
	}
}

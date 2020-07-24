package com;

import java.util.Arrays;

import org.hibernate.Session;

import utils.HibernateUtils;

//index --its required for searching value based on some column.internally DB used some algorithm for performance increase.
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

			BooksModel book2 = new BooksModel();
			book2.setBName("abce");
			book2.setPrize(500);

			student.setBook(Arrays.asList(book1, book2));

			book1.setStudent(student);
			book2.setStudent(student);

			session.save(student);

			session.getTransaction().commit();
		}
	}
}

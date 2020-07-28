package com;

import java.util.Arrays;

import org.hibernate.Session;

import utils.HibernateUtils;

//in this case hibernate create 2 join table ..with respective primary and foreign key
public class App {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.beginTransaction();

			StudentModel student = new StudentModel();
			student.setName("anil");
			student.setCity("UP");
			student.setEnroll(001);
			student.setStd(12);

			StudentModel student2 = new StudentModel();
			student2.setName("kishan");
			student2.setCity("amd");
			student2.setEnroll(005);
			student2.setStd(11);

			BooksModel book1 = new BooksModel();
			book1.setBName("abcd");
			book1.setPrize(2345);

			BooksModel book2 = new BooksModel();
			book2.setBName("mnop");
			book2.setPrize(500);

			student.setBook(Arrays.asList(book1, book2));

			book1.setStds(Arrays.asList(student));
			book1.setStds(Arrays.asList(student2));

			student2.setBook(Arrays.asList(book1, book2));

			book1.setStds(Arrays.asList(student2));

			session.save(student);
			session.save(student2);

			session.getTransaction().commit();
		}

	}
}

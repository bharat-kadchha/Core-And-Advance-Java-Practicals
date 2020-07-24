package com;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;

import utils.HibernateUtils;

//@immutable annotation used to prevent updating entity as well as collection attributes.its also apply class level or attribute level.
//@immutable and @Entity(mutable = false) both are same.

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			addStudentDetails(session);

			updateBook(session); // we can update single book details .because its not annotated with @immutable.

			updateStudentBook(session); // here ,we can't update the list of student book .because its annotated with
										// @immutable.
		}

	}

	public static void addStudentDetails(Session session) {
		session.beginTransaction();

		StudentModel student1 = new StudentModel();
		student1.setName("anil");
		student1.setCity("UP");
		student1.setEnroll(001);
		student1.setStd(12);

		BooksModel book1 = new BooksModel();
		book1.setBName("2 states");
		book1.setPrize(2345);

		BooksModel book2 = new BooksModel();
		book2.setBName("positive thinking");
		book2.setPrize(500);

		student1.setBook(Arrays.asList(book1, book2));

		session.save(student1);

		session.getTransaction().commit();
	}

	public static void updateBook(Session session) {

		int bookId = 1;

		BooksModel book = (BooksModel) session.get(BooksModel.class, bookId);

		book.setBName("the jungle book");
		book.setPrize(460);
		session.beginTransaction();

		session.update(book);
		session.getTransaction().commit();

	}

	public static void updateStudentBook(Session session) {

		StudentModel student = (StudentModel) session.get(StudentModel.class, 1);

		List<BooksModel> list = student.getBook();

		list.remove(0);

		session.beginTransaction();
		session.update(student);
		session.getTransaction().commit();

	}
}

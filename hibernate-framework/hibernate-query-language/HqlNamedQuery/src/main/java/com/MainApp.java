package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		getStudent();
	}

	@SuppressWarnings("deprecation")
	public static void getStudent() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			// HQL namedQuery is global ones we define then used in anywhere
			@SuppressWarnings("unchecked")
			Query<StudentModel> hql = session.getNamedQuery("getStudentById");
			hql.setInteger(1, 2);

			StudentModel std = (StudentModel) hql.uniqueResult();

			System.out.println(std);

			Query hql1 = session.getNamedQuery("getStudentByName");
			hql1.setString(1, "kiran");
			@SuppressWarnings("unchecked")
			List<StudentModel> list = hql1.list();
			System.out.println(list);
		}
	}

	public static void addStudent() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student = new StudentModel();
			student.setName("praksh");
			student.setCity("gujrat");
			student.setEnroll(005);
			student.setStd(11);

			BooksModel b1 = new BooksModel();
			b1.setBName("fff");
			b1.setPrize(600);

			student.setBook(b1);
			session.beginTransaction();

			session.save(student);

			session.getTransaction().commit();
		}

	}
}

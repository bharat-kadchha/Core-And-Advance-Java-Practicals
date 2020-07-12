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

			session.save(student);

			session.getTransaction().commit();

			HibernateUtils.closeSessionfactory();

		}

	}
}

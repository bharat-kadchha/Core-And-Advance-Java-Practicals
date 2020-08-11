package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student = new StudentModel();
			student.setName("anil");
			student.setCity("UP");
			student.setEnroll(001);
			student.setStd(12);

			PersonModel person = new PersonModel();
			person.setPNo(10);
			person.setGender("male");

			session.beginTransaction();

			session.save(person);
			session.save(student);

			session.getTransaction().commit();
		}

	}
}

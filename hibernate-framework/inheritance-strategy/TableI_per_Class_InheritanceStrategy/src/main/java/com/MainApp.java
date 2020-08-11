package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student1 = new StudentModel();
			student1.setName("anil");
			student1.setCity("UP");
			student1.setEnroll(001);
			student1.setStd(12);

			PersonModel person1 = new PersonModel();
			person1.setPNo(10);
			person1.setGender("male");

			session.beginTransaction();

			session.save(student1);
			session.save(person1);
			// it is called normalization in DBMS. her different table created as per class

			session.getTransaction().commit();
		}

	}
}

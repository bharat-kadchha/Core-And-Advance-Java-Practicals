package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel studentModel = new StudentModel();
			studentModel.setCity("califronia");
			studentModel.setName("amberdon");

			session.save(studentModel); // here we have to change in ACID property.

			session.beginTransaction().commit(); // transaction is committed then data will be save in to DB.
		}
	}
}

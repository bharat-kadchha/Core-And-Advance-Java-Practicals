package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.save(getStudent());
			session.beginTransaction().commit();
		}

	}

	public static StudentModel getStudent() {

		StudentModel student = new StudentModel();

		student.setName("hiren");
		student.setCity("vvv");
		student.setStypand(4000);
		return student;

	}
}

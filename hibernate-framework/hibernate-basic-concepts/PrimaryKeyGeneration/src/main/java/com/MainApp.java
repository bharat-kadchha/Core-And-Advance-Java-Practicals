package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		// auto();
		// identity();
		// sequence();
		table();
	}

	public static void auto() {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			AutoTypeDemo student = new AutoTypeDemo();
			student.setCity("rajkot");
			student.setName("prabhash");

			session.save(student);

			session.beginTransaction().commit();
		}
	}

	public static void identity() {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			IdentityTypeDemo id = new IdentityTypeDemo();
			id.setCity("rajkot");
			id.setName("prabhash");

			session.save(id);

			session.beginTransaction().commit();

		}
	}

	public static void sequence() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			SequenceTypeDemo seq = new SequenceTypeDemo();
			seq.setCity("rajkot");
			seq.setName("prabhash");

			session.save(seq);

			session.beginTransaction().commit();
		}
	}

	public static void table() {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			TableTypeDemo t = new TableTypeDemo();
			t.setCity("rajkot");
			t.setName("prabhash");

			session.save(t);

			session.beginTransaction().commit();
		}
	}
}

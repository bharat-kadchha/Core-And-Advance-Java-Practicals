package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class FristLevelCacheDemo {
	public static void main(String[] args) {

		// sessionCacheInsertRecord();
		// sessionCacheGetRecord();
		// sessionCacheUpdatedRecord();
		// sessionCacheDeletedRecord();

	}

	public static void sessionCacheDeletedRecord() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();

			int sid = 1;
			StudentModel student1 = session.get(StudentModel.class, sid);

			// delete the record from the database.as well as cache.
			session.delete(student1);
			session.getTransaction().commit();
			System.out.println("-----------------------------------");
			StudentModel student2 = session.get(StudentModel.class, sid);

			// here .hibernate find same object in to cache but if its not there then fire.
			// select query.
			System.out.println(student2);
			HibernateUtils.closeSessionfactory();

		}
	}

	public static void sessionCacheUpdatedRecord() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();

			int sid = 1;
			StudentModel student2 = session.get(StudentModel.class, sid);
			System.out.println(student2);

			student2.setEnroll(2345);
			student2.setName("amirkhan");
			student2.setStd(12);
			session.getTransaction().commit();
			System.out.println("-----------------------------------");
			StudentModel student3 = session.get(StudentModel.class, sid);

			// here .result coming from session cache with updated data.hibernate does not
			// fire select query.
			System.out.println(student3);
			HibernateUtils.closeSessionfactory();

		}
	}

	public static void sessionCacheGetRecord() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();

			int sid = 1;
			StudentModel student2 = session.get(StudentModel.class, sid);
			System.out.println(student2);
			session.getTransaction().commit();
			System.out.println("-----------------------------------");
			StudentModel student3 = session.get(StudentModel.class, sid);

			// here .result coming from session cache.hibernate does not fire select query.
			System.out.println(student3);
			HibernateUtils.closeSessionfactory();

		}
	}

	public static void sessionCacheInsertRecord() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			session.beginTransaction();

			StudentModel student1 = new StudentModel();
			student1.setName("anil");
			student1.setCity("UP");
			student1.setEnroll(001);
			student1.setStd(12);

			int sid = (int) session.save(student1); // here hibernate fire insert query and result store in session
													// object.
			session.getTransaction().commit();

			StudentModel student2 = session.get(StudentModel.class, sid);
			// here .result coming from session cache.hibernate does not fire select query.
			System.out.println(student2);
			HibernateUtils.closeSessionfactory();

		}
	}
}

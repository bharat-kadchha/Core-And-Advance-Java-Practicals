package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {
		getById();
		getBySimpleNaturalId();
		getByNaturalId();

		cleanEntity();
	}

	// evicting method used to remove object from frist level cache.
	public static void cleanEntity() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			// first time create query for id 3
			StudentModel student = (StudentModel) session.get(StudentModel.class, 3);
			System.out.println(student);

			// evict method remove single object.and query fire 2 times for same data
			session.evict(student);

			// this will clear all the object in to session.
			session.clear();

			System.out.println("-----------------------------");
			
			// second time not fire query for same id.it will get form session cache.
			StudentModel student2 = (StudentModel) session.get(StudentModel.class, 3);
			System.out.println(student2);

			session.beginTransaction().commit();
		}

	}

	public static void getByNaturalId() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String naturalld = "C123";
			StudentModel student = (StudentModel) session.byNaturalId(StudentModel.class).using("enroll", naturalld).load();
			System.out.println(student);
			session.beginTransaction().commit();
		}
	}

	public static void getBySimpleNaturalId() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String naturalId = "C125";
			StudentModel student = (StudentModel) session.bySimpleNaturalId(StudentModel.class).getReference(naturalId);
			System.out.println(student);
			session.beginTransaction().commit();
		}
	}

	public static void getById() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student = (StudentModel) session.byId(StudentModel.class).load(3);
			System.out.println(student);
			session.beginTransaction().commit();
		}
	}

}

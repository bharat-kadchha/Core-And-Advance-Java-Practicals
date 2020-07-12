package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentCrud.createStudent(session);

			 StudentCrud.getStudentById(session, 3);

			 StudentCrud.insertStudent(session, new StudentModel());

			 StudentCrud.updatedentById(session, 4);

			 StudentCrud.deleteStudentById(session, 4);
		}
	}
}

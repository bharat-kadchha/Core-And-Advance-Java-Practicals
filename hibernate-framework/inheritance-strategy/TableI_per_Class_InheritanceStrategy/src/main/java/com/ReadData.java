package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class ReadData {

	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.beginTransaction();

			StudentModel student = (StudentModel) session.get(StudentModel.class, 2);
			if ((student instanceof StudentModel) && !(student instanceof PersonModel)) {
				System.out.println(student);
			} else if ((student instanceof StudentModel) && (student instanceof PersonModel)) {
				PersonModel person = (PersonModel) student;
				System.out.println(person);
			}
			session.getTransaction().commit();
		}
	}
}

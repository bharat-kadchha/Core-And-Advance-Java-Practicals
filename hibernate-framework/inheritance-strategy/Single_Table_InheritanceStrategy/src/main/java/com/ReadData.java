package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class ReadData {

	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.beginTransaction();

			StudentModel studentModel = (StudentModel) session.get(StudentModel.class, 2);
			if ((studentModel instanceof StudentModel) && !(studentModel instanceof PersonModel)) {
				System.out.println(studentModel);
			} else if ((studentModel instanceof StudentModel) && (studentModel instanceof PersonModel)) {
				PersonModel personModel = (PersonModel) studentModel;
				System.out.println(personModel);
			}
			session.getTransaction().commit();
		}

	}
}

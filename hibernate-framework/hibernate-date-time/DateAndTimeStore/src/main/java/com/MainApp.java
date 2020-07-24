package com;

import java.util.Date;

import org.hibernate.Session;

import utils.HibernateUtils;


public class MainApp {
	public static void main(String[] args) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student1 = new StudentModel();

			student1.setName("john");
			student1.setEnroll("S124");

			student1.setUtilDate(new Date()); // store yyyy-mm-dd hh-MM-ss

			student1.setOnlyDate(new Date()); // store only yyyy-mm-dd

			session.save(student1);

			StudentModel student2 = (StudentModel) session.bySimpleNaturalId(StudentModel.class).getReference("S124");

			System.out.println(student2);
			session.beginTransaction().commit();
		}
	}

}

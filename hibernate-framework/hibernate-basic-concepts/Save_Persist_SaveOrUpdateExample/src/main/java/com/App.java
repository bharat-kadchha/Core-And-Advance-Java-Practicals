package com;

import java.io.Serializable;

import org.hibernate.Session;

import utils.HibernateUtils;

public class App {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student1 = new StudentModel();
			student1.setCity("porbandar");
			student1.setName("ram");

			StudentModel student2 = new StudentModel();
			student2.setCity("kutiyana");
			student2.setName("bharat");

			StudentModel student3 = new StudentModel();
			student3.setCity("ranavav");
			student3.setName("rahul");

			Integer i = (Integer) session.save(student1); // save method return Serializable or a primary key of the object/,

			session.persist(student2); // return void.

			session.saveOrUpdate(student3); // save or update based on primary key

			System.out.println("employee id-" + i);
			session.beginTransaction().commit();// transaction is committed then data will be save in to DB.

		}
	}
}

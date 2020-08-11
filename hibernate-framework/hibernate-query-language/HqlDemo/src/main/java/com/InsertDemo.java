package com;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

//HQL not support old fashion of INSERT INTO ...VALUES .
// 1 you have to insert data then use INSERT_SELECT operation..(means select data and insert)
// 2 direct save()

public class InsertDemo {

	public static void main(String[] args) {

		insertRecord();

	}

	public static void insertRecord() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			// String HQL="insert into Student(name,city) values('ketan' ,'rajkot')"; this is not support
			String HQL = "insert into StudentBackup(name,city)" + "select name,city from Student";

			Query que = session.createQuery(HQL);

			int i = que.executeUpdate();
			System.out.println(i + " inserted..");
			session.beginTransaction().commit();

		}
	}
}

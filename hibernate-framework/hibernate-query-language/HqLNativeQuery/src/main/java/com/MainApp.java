package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.type.IntegerType;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {
		getAll();
		getIdAndName();

	}

	public static void getIdAndName() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			@SuppressWarnings("unchecked")
			List<Object[]> sql = session.createSQLQuery("select id,s_name from student_table")
					.addScalar("id", IntegerType.INSTANCE).addScalar("s_name").list();

			for (Object[] obj : sql) {
				System.out.println((Integer) obj[0]);
				System.out.print((String) obj[1]);
			}

			session.beginTransaction().commit();
		}
	}

	public static void getAll() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			@SuppressWarnings("unchecked")
			List<StudentModel> sql = session.createSQLQuery("select * from student_table").addEntity(StudentModel.class).list();

			for (StudentModel obj : sql) {
				System.out.println(obj);
			}

			session.beginTransaction().commit();
		}
	}
}

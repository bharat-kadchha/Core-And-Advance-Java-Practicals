package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

//HQl---hibernate query language..the syntax of it is quite similar to the SQL.

//HQL--use class name as table name and property name is column name.

public class MainApp {
	public static void main(String[] args) {

		getAllStudent();
		getStudentById(2);
		getStudentByIdAndName(2, "bharat");

		getStudentNames();
		getStudentNamesAndCity();

	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void getAllStudent() {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			// here use class name as a table name.
			String HQL = "from Student";
			Query<StudentModel> que = session.createQuery(HQL);
			List<StudentModel> sList = que.list();
			for (StudentModel ss : sList) {
				System.out.println(ss);

			}
			session.beginTransaction().commit();
		}

	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void getStudentById(int id) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			// here use class name as a table name.and variable name as column
			String HQL = "from Student where id=" + id;
			Query que = session.createQuery(HQL);
			StudentModel s = (StudentModel) que.uniqueResult();
			System.out.println(s);
			session.beginTransaction().commit();

		}
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void getStudentByIdAndName(int id, String name) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			// here use class name as a table name.
			String HQL = "from Student where id=? and name=?";
			Query que = session.createQuery(HQL);

			// set parameter of dynamic query with position.
			que.setInteger(0, 2);

			que.setParameter(1, name);
			System.out.println(que.uniqueResult());
			session.beginTransaction().commit();

		}
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void getStudentNames() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String HQL = "select name from Student";
			Query que = session.createQuery(HQL);
			List<String> names = que.list();
			for (String s : names) {
				System.out.println(s);
			}
			session.beginTransaction().commit();

		}
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void getStudentNamesAndCity() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String HQL = "select name,city from Student";
			Query que = session.createQuery(HQL);
			List<Object[]> names = que.list();
			for (Object[] s : names) {
				System.out.println((String) s[0] + " " + (String) s[1]);
			}
			session.beginTransaction().commit();

		}
	}
}

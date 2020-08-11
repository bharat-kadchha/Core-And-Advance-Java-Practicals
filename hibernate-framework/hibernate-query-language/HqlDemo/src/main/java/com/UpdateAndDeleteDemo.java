package com;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

public class UpdateAndDeleteDemo {

	public static void main(String[] args) {

		// updateStudent(2, "aaaaa", "zzzzzz");
		deleteStudentByName("ram");

	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void updateStudent(int id, String name, String city) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String HQL = "update Student set name=:name ,city=:city where id=:id";

			Query<StudentModel> que = session.createQuery(HQL);

			que.setParameter("name", name);
			que.setParameter("city", city);

			que.setParameter("id", id);

			que.executeUpdate();
			System.out.println("update");
			session.beginTransaction().commit();

		}
	}

	@SuppressWarnings({ "deprecation", "unchecked" })

	public static void deleteStudentByName(String name) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String HQL = "delete from Student where name=?";

			Query que = session.createQuery(HQL);

			que.setParameter(0, name);

			int i = que.executeUpdate();
			System.out.println(i + " DELETED");
			session.beginTransaction().commit();

		}
	}
}

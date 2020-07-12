package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class StudentDAOImpl implements StudentDAO {

	public void insertStudent(StudentModel student) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			Integer id = (Integer) session.save(student);
			System.out.println("employee table generated with id :" + id);

			session.beginTransaction().commit();
		}
	}

	public StudentModel getStudentById(int id) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student = (StudentModel) session.get(StudentModel.class, id);
			if (student != null) {

				System.out.println(student);

			} else {
				System.out.println("data not found");
			}
			session.beginTransaction().commit();

			return student;

		}
	}

	public void updatedentById(int id, int salary) {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student = (StudentModel) session.get(StudentModel.class, id);
			if (student != null) {

				student.setSalary(salary);
				session.saveOrUpdate(student);
				session.beginTransaction().commit();

			} else {
				System.out.println("data not found");
			}
			session.beginTransaction().commit();
		}
	}

	public void deleteStudentById(int id) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student = (StudentModel) session.get(StudentModel.class, id);
			if (student != null) {

				session.delete(student);
				session.beginTransaction().commit();
				System.out.println("record deleted..");
			} else {
				System.out.println("data not found");
			}
			session.beginTransaction().commit();
		}

	}

}

package com;

import org.hibernate.Session;

import utils.HibernateUtils;

//session.merge() = Telling to hibernate to get the object from other session which is closed .
// i have to modified in current session. so that time merge method is used.
// it is used internally cascadeType--merge

//session.update() = update method only for current session.

public class MainApp {
	public static void main(String[] args) {

		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();

		// session.save(getStudent());

		StudentModel student = (StudentModel) session.get(StudentModel.class, 1);

		session.getTransaction().commit();

		student.setCity("aligadh");

		session.close();
		Session session1 = HibernateUtils.getSessionFactory().openSession();
		session1.beginTransaction();

		StudentModel student1 = (StudentModel) session1.get(StudentModel.class, 1);

		// session1.update(student); //here getting error (student is associate with other
		// session)

		session1.merge(student);
		session1.getTransaction().commit();
		session1.close();

	}

	public static StudentModel getStudent() {

		StudentModel student = new StudentModel();
		student.setName("anil");
		student.setCity("maharastra");
		student.setEnroll(005);
		student.setStd(10);
		return student;

	}
}

package com;

import org.hibernate.Session;

public class StudentCrud {

	public static void createStudent(Session session) {

		StudentModel std = new StudentModel();

		std.setId(6);
		std.setName("ramesh");
		std.setCity("india");
		session.save(std); // Integer id = (Integer) session.save(std);
		System.out.println("employee table created ");

		session.beginTransaction().commit();
	}

	public static void insertStudent(Session session, StudentModel sts) {

		sts.setName("rahul");
		sts.setCity("london");
		session.saveOrUpdate(sts);
		session.beginTransaction().commit();
		System.out.println("data inserted....");

	}

	public static void getStudentById(Session s, int id) {

		StudentModel std = (StudentModel) s.get(StudentModel.class, id);
		if (std != null) {
			System.out.println(std.getId() + std.getName() + std.getCity());
		} else {
			System.out.println("data not found");
		}
	}

	public static void deleteStudentById(Session session, int id) {

		StudentModel std = (StudentModel) session.get(StudentModel.class, id);
		if (std != null) {

			session.delete(std);
			session.beginTransaction().commit();
			System.out.println("record deleted..");
		} else {
			System.out.println("data not found");
		}

	}

	public static void updatedentById(Session session, int id) {

		StudentModel std = (StudentModel) session.get(StudentModel.class, id);
		if (std != null) {

			std.setCity("America");
			std.setName("katrina");
			session.saveOrUpdate(std);
			session.beginTransaction().commit();

		} else {
			System.out.println("data not found");
		}
	}

}

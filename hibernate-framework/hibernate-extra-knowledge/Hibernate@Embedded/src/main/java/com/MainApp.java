package com;

import org.hibernate.Session;

import utils.HibernateUtils;

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student = new StudentModel();
			student.setName("anil");
			student.setCity("UP");
			student.setStd(12);

			MarksModel marksModel1 = new MarksModel();

			marksModel1.setEnglsh(67.76f);
			marksModel1.setMath(89);
			marksModel1.setScience(81.80f);

			student.setPrevoiusMarks(marksModel1);

			MarksModel marksModel2 = new MarksModel();

			marksModel2.setEnglsh(70.76f);
			marksModel2.setMath(40);
			marksModel2.setScience(90.11f);

			student.setCurrentMarks(marksModel2);
			session.save(student);

			session.beginTransaction().commit();
		}

	}
}

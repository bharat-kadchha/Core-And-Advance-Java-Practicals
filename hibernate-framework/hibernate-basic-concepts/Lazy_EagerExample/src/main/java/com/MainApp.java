package com;

import org.hibernate.Session;

import utils.HibernateUtils;

/* here ..hibernate can gives us only student info..not books.because...by default the fetching type is--LAZY loading
 so we have write extra code for getting related info. (line no 26)
*/

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student = (StudentModel) session.get(StudentModel.class, 1);

			System.out.println(student);

			// for LAZY

			if (student != null) {
				student.getCollection().forEach(System.out::println);
			}

			session.beginTransaction().commit();
		}

	}
}

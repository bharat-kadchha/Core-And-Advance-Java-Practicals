package com;

import org.hibernate.Session;

import utils.HibernateUtils;

/*
  DIRTY_CHECKING_CONCEPT--to avoid to time consuming DATABASE action updating table or data without effecting to other field,
 *  it means query is perform only updating field.remaining unchanged.
 */

/*here we can't use @DynamicUpdate then set all the column with empty value
 because..first select entity and then update---(so it may be time consuming) see change in console..
and used @dynamicUpdate then update only selected column.
*/
public class MainApp {
	public static void main(String[] args) {

		insertData();

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student = (StudentModel) session.get(StudentModel.class, 1);

			if (student != null) {

				student.setName("ramesh");
				student.setCity("ahmadabad");
				session.update(student);
				session.beginTransaction().commit();

			}

		}
	}

	public static void insertData() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student1 = new StudentModel();
			student1.setName("raghav");
			student1.setCity("rajkot");
			student1.setPinCode(452356);
			student1.setSalary(15000);

			session.save(student1);
			session.beginTransaction().commit();

		}

	}
}

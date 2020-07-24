package com;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.hibernate.Session;

import utils.HibernateUtils;

public class App {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			StudentModel student = new StudentModel();

			student.setName("john");
			student.setEnroll("S124");

			LocalDate date = LocalDate.now();
			student.setLocalDate(date);

			ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

			student.setZoneDateTime(dateTime);
			session.save(student);

			StudentModel student2 = (StudentModel) session.bySimpleNaturalId(StudentModel.class).getReference("S124");

			System.out.println(student2);
			session.beginTransaction().commit();
		}
	}

}

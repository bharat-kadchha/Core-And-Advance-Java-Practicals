package com;

import java.sql.CallableStatement;
import java.sql.Types;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

public class App {
	public static void main(String[] args) {
		
		callProcedure();
		callFunction();

	}

	public static void callProcedure() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			Query query = session.createSQLQuery("CALL getStudent(:sid)").addEntity(StudentModel.class).setParameter("sid",2);

			List<StudentModel> list = query.list();

			for (StudentModel student : list) {
				System.out.println(student);
			}
			session.beginTransaction().commit();
		}
	}

	public static void callFunction() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			session.doWork(con -> {
				try (CallableStatement callStm = con.prepareCall("{? = CALL mysum(? , ?)}")) {

					callStm.registerOutParameter(1, Types.INTEGER);
					callStm.setInt(2, 12);
					callStm.setInt(3, 4);
					callStm.execute();
					System.out.println(callStm.getInt(1));
				}
			});

			session.beginTransaction().commit();
		}

	}

}

package com;

import java.io.IOException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import utils.HibernateUtils;

public class AggrigationDemo {

	public static void main(String[] args) throws IOException {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String HQL = "select COUNT(s.stypand),AVG(s.stypand),SUM(s.stypand),MAX(s.stypand) from Student s";

			Query que = session.createQuery(HQL);

			List<Object[]> list = que.list();

			for (Object[] obj : list) {
				System.out.println("count =" + obj[0]);
				System.out.println("avarage =" + obj[1]);
				System.out.println("sum =" + obj[2]);
				System.out.println("max =" + obj[3]);

			}

			session.beginTransaction().commit();
		}

	}
}

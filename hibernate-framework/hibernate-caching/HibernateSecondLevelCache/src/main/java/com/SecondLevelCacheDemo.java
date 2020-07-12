package com;

import org.hibernate.Session;

import utils.HibernateUtils;

/*	second level caceh.we can use third party service like EHcache.and configure properties in .xml
	first level--we can fetch data from cache of single session only.
	second level--we can fetch data from cache of multiple session. as per over configuration.
*/

public class SecondLevelCacheDemo {
	public static void main(String[] args) {

		sessionCacheGetRecord();

	}

	public static void sessionCacheGetRecord() {
		Session session = null;
		try {

			session = HibernateUtils.getSessionFactory().openSession();
			int sid = 2;
			StudentModel student2 = session.get(StudentModel.class, sid);
			System.out.println(student2);
			System.out.println("-------------------------");

		} finally {
			if (session != null)
				session.close();
		}
		try {
			session = HibernateUtils.getSessionFactory().openSession();

			int sid = 2;
			StudentModel student2 = session.get(StudentModel.class, sid);
			System.out.println(student2);
			System.out.println("-------------------------");

		} finally {
			if (session != null)
				session.close();
		}
	}

}

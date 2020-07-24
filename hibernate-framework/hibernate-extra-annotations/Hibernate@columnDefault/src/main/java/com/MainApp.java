package com;

import org.hibernate.Session;

import utils.HibernateUtils;

//@ColumnDefault --if we want to set default value of column .

//@DynamicInsert-- for the inserting dynamically.

public class MainApp {
	public static void main(String[] args) {

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			
			session.beginTransaction();
			EmployeeModel employee = new EmployeeModel();
			employee.setCredit(12345.43);
			session.save(employee);
			session.getTransaction().commit();

		}
	}

}

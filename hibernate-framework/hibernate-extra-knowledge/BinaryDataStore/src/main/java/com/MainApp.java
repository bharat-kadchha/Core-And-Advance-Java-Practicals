package com;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.hibernate.Session;
import org.hibernate.engine.jdbc.BlobProxy;

import utils.HibernateUtils;

public class MainApp {

	public static void main(String[] args) {

		addEmployee();
		getEmployee();

	}

	public static void getEmployee() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			EmployeeModel emp1 = (EmployeeModel) session.bySimpleNaturalId(EmployeeModel.class).load("E123");

			System.out.println(emp1);

			InputStream in = emp1.getEmpPic().getBinaryStream();

			Files.copy(in, Paths.get("outputPics/Capture.PNG"));
			in.close();
			session.beginTransaction().commit();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void addEmployee() {
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			EmployeeModel emp1 = new EmployeeModel();

			emp1.setEmpNo("E123");
			emp1.setName("john");
			emp1.setCity("london");

			emp1.setEmpPic(BlobProxy.generateProxy(getImage()));

			session.save(emp1);
			session.beginTransaction().commit();

		}
	}

	public static byte[] getImage() {
		try {
			return Files.readAllBytes(Paths.get("inputPics/Capture.PNG"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}

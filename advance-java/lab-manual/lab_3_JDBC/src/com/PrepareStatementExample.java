package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.XMLEntityManager.ScannedEntity;

public class PrepareStatementExample {
	public static void main(String[] args) {
		try {

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("connection established..");

			Connection connection = DriverManager
					.getConnection("jdbc:odbc:student");
			System.out.println("enter student information :");

			Scanner scanner = new Scanner(System.in);
			
			System.out.println("enter name :");
			String name = scanner.nextLine();
			
			System.out.println("enter city :");
			String city = scanner.nextLine();
			
			System.out.println("enter date(dd/MM/yyyy) :");
			String date = scanner.nextLine();
			
			long millseconds = java.util.Date.parse(date);
			Date sqlDate = new Date(millseconds);

			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO info(name,city,myDate) values(?,?,?)");

			statement.setString(1, name);
			statement.setString(2, city);
			statement.setDate(3, sqlDate);

			int count = statement.executeUpdate();

			System.out.println(count + " row inserted.");
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

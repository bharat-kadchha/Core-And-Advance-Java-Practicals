package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleStatementExample {
	public static void main(String[] args) {

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("connection established..");

			Connection connection = DriverManager
					.getConnection("jdbc:odbc:student");

			Statement statement = connection.createStatement();

			int insertCount = statement
					.executeUpdate("INSERT INTO info(name,city) VALUES('karan','india')");

			System.out.println(insertCount + "row inserted.");

			int updateCount = statement
					.executeUpdate("UPDATE info SET name='aamir' WHERE id=23");
			System.out.println(updateCount + "row updated..");

			int deleteCount = statement
					.executeUpdate("DELETE FROM info WHERE id=22");

			System.out.println(deleteCount + "row deleted.");

			ResultSet resultSet = statement.executeQuery("select * from info");

			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + "***"
						+ resultSet.getString(2));

			}
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

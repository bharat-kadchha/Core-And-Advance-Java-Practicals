package org;

import java.sql.*;

public class UseOfODBC {

	public static void main(String[] args) {
		try {

			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");							
			System.out.println("connection established..");

			Connection connection = DriverManager.getConnection("jdbc:odbc:student");
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from info");

			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + "***"+ resultSet.getString(2));

			}
			connection.close();

		} catch (Exception e) {

		}
	}
}

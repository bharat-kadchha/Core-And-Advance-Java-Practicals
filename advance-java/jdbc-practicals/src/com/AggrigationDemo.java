package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AggrigationDemo {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("done");

		Connection connection = DriverManager.getConnection("jdbc:odbc:student");

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("select city,count(city) from info group by city");

		while (resultSet.next()) {

			System.out.println(resultSet.getString(1) + " : "
					+ resultSet.getInt(2));

		}
		connection.close();
	}
}

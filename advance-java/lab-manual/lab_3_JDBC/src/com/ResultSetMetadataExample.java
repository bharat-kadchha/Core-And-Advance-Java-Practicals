package com;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetadataExample {

	public static void main(String[] args) {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("connection established..");

			Connection connection = DriverManager
					.getConnection("jdbc:odbc:student");
			DatabaseMetaData metaData = connection.getMetaData();
			System.out.println("-----------database metadata-----------");
			System.out.println("driver name - " + metaData.getDriverName());
			System.out.println("driver version - "
					+ metaData.getDriverVersion());
			System.out.println("user Name - " + metaData.getUserName());
			System.out.println("database product name - "
					+ metaData.getDatabaseProductName());

			// feature not implemented in MS access
			// System.out.println("database schemas - " +
			// metaData.getSchemas());

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement
					.executeQuery("SELECT * FROM info");

			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			System.out.println("-----------resultset metadata-----------");

			System.out.println("column count - "
					+ resultSetMetaData.getColumnCount());
			System.out.println("1st column name -  "
					+ resultSetMetaData.getColumnName(1));
			System.out.println("1st column type name - "
					+ resultSetMetaData.getColumnTypeName(1));

			connection.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ExecuteMethod {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("done");

		Connection con = DriverManager.getConnection("jdbc:odbc:student");

		Statement statement = con.createStatement();

		Scanner s = new Scanner(System.in);
		String sqlQuery = s.nextLine();

		boolean rset = statement.execute(sqlQuery); // return boolean
		if (rset == true) {
			ResultSet resultSet = statement.getResultSet();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("ID"));

			}
		} else {
			System.out.println("updated count" + statement.getUpdateCount());
		}

		con.close();
	}
}

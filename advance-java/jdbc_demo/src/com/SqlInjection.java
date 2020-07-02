package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlInjection {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("done");

		Connection con = DriverManager.getConnection("jdbc:odbc:student");

		Statement stm = con.createStatement();
		// hacker enter input some special character and change the behaviors of
		// query.
		Scanner s = new Scanner(System.in);
		System.out.print("name=");
		String name = s.nextLine();
		System.out.print("city=");
		String city = s.next();

		String sql = "select count(*) from info where name='" + name
				+ "' and city='" + city + "'";

		ResultSet rs = stm.executeQuery(sql);
		int c = 0;
		if (rs.next()) {
			c = rs.getInt(1);
		}
		if (c == 0) {
			System.out.println("invalid  user");
		} else {
			System.out.println("valid  user");
		}
		con.close();
	}

}

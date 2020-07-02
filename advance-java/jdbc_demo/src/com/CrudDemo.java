package com;

import java.sql.*;
import java.util.Enumeration;
import java.util.Scanner;

public class CrudDemo {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection connection = DriverManager
				.getConnection("jdbc:odbc:student");

		Statement statement = connection.createStatement();
		int ch = 0;

		System.out.println("welecome to database CRUD ...");
		do {
			System.out.println("what you are perfrom ?\nselect no.=");

			System.out.print("1=select\t2=insert\t3=update\t4=delete");

			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			switch (i) {
			case 1:
				select(statement);
				break;
			case 2:
				insert(statement);
				break;
			case 3:
				update(statement);
				break;
			case 4:
				delete(statement);
				break;
			default:
				System.out.println("enter right chioce..");
				break;

			}

			System.out.println("do you want to continue ?(1/0)");

			ch = scanner.nextInt();

		} while (ch == 1);

		connection.close();
	}

	public static void select(Statement statement) throws SQLException {
		ResultSet rs = statement.executeQuery("select * from info");

		while (rs.next()) {
			System.out.println(rs.getString("ID") + " : "
					+ rs.getString("NAME"));

		}
		// c.close();
	}

	public static void insert(Statement statement) throws SQLException {
		statement.executeUpdate("insert into info values(10,'happy','rjk')");

		System.out.println(statement.getUpdateCount() + " row inserted..");
	}

	public static void update(Statement statement) throws SQLException {
		statement.executeUpdate("update info set name='hiren' where ID=5");
		System.out.println(statement.getUpdateCount() + " row updated..");

	}

	public static void delete(Statement statement) throws SQLException {
		statement.executeUpdate("delete from info where ID=10");
		System.out.println(statement.getUpdateCount() + " row deleted..");
	}
}

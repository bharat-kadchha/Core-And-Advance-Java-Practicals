package com;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection connection = DriverManager.getConnection("jdbc:odbc:student");

		Statement statement = connection.createStatement();

		String q1 = "insert into info values(18,'sahil','ranavav')";

		statement.addBatch(q1);

		String q2 = "insert into info values(16,'jerry','bilkha')";

		statement.addBatch(q2);

		String q3 = "insert into info values(17,'tom','kutiyana')";

		statement.addBatch(q3);

		int[] list = statement.executeBatch();

		System.out.println(list[0]);

		connection.close();
	}

}

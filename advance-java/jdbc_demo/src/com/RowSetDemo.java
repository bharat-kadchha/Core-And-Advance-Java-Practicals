package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RowSetDemo {

	public static void main(String[] args) throws Exception {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String constr = "jdbc:odbc:Driver={Microsoft Excel Driver(*.xls)};DBQ=C:/Users/abc/Desktop/employee.xlsx)}"
				+ "DriverID=22;READONLYE=false";
		Connection c = DriverManager.getConnection("jdbc:odbc:employeedsn");

		PreparedStatement statement = c.prepareStatement("select * from [record$]",
				Statement.RETURN_GENERATED_KEYS);
		// ResultSet rs=s.executeQuery("select  name,city from [record$]");
		ResultSet rs = statement.getGeneratedKeys();
		while (rs.next()) {
			System.out.println(rs.getString(1) + " : " + rs.getString(2));
		}
		c.close();

	}

}

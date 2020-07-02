package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExcelDeatabaseDemo {

	public static void main(String[] args) throws Exception {

		// 1--->configure DSN with this excel file..
		// 2---> access .. select * from [nameOfSheet$] //default==sheet1

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String constr = "jdbc:odbc:Driver={Microsoft Excel Driver(*.xls)};DBQ=C:/Users/abc/Desktop/employee.xlsx)}"
				+ "DriverID=22;READONLYE=false";
		
		Connection con = DriverManager.getConnection("jdbc:odbc:employeedsn");

		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery("select * from [record$]");

		while (rs.next()) {
			System.out.println(rs.getString(1) + " : " + rs.getString(2));
		}

		// INSERT DATA IN TO SHEET

		Statement statement2 = con.createStatement();
		statement2.executeUpdate("insert into [sheet1$] values('bharat','jadeja',23)");
		System.out.println("inserted");

		con.close();
	}

}

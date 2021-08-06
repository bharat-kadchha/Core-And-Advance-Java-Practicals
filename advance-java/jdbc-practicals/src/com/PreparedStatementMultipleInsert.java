package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementMultipleInsert {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("done");

		Connection con = DriverManager.getConnection("jdbc:odbc:student");
		String sql = "insert into info values(?,?,?)";

		PreparedStatement stm = con.prepareStatement(sql);
		// this statement store and compile query only ones.
		// so the execution time is decrease.
		while (true) {

			Scanner s = new Scanner(System.in);

			System.out.print("enter e_no=");
			int no = s.nextInt();
			System.out.println("enter e_name=");
			String name = s.next();
			System.out.println("enter e_city=");
			String city = s.next();

			stm.setInt(1, no);
			stm.setString(2, name);
			stm.setString(3, city);

			stm.executeUpdate();// this method runs n time ..but compile only ones.
			System.out.println("continue ...0/1");
			int i = s.nextInt();
			if (i == 0) {
				break;
			}
		}
		System.out.println(stm.getUpdateCount() + " rows inserted...");
		con.close();
	}
}
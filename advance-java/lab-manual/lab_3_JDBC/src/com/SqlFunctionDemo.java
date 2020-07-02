package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class SqlFunctionDemo {
	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connection established..");

			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/studentdata",
							"root", "123456");

			// with out parameter
			CallableStatement callableStatement = connection.prepareCall("{ ? = CALL sum(?,?)}");
			callableStatement.setInt(2, 50);
			callableStatement.setInt(3, 40);
			callableStatement.registerOutParameter(1, Types.INTEGER);
			callableStatement.execute();

			System.out.println("result of sum() = "+callableStatement.getInt(1));
			
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
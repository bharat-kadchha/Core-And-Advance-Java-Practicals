package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class StoreProcedureDemo {
	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connection established..");

			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/studentdata",
							"root", "123456");

			// with out parameter
			CallableStatement callableStatement = connection.prepareCall("CALL getAll()");
			callableStatement.execute();

			// with parameter
			CallableStatement callableStatement2 = connection.prepareCall("CALL getStudent(:sid)");
			callableStatement2.setString(1, "kiran");
			callableStatement2.execute();

			CallableStatement callableStatement3 = connection.prepareCall("CALL add(?,?,?)");
			callableStatement3.setInt(1, 100);
			callableStatement3.setInt(2, 200);
			callableStatement3.registerOutParameter(3, Types.INTEGER);
			callableStatement3.execute();
			System.out.println("result of add() procedure = " + callableStatement3.getInt(3));

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
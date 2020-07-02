package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionWithMySql {
	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connection established..");

			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/studentdata","root","123456");
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from employee");

			while(resultSet.next())
			{
				System.out.println(resultSet.getString(1)+"--"+resultSet.getString(2));
			}
			

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}

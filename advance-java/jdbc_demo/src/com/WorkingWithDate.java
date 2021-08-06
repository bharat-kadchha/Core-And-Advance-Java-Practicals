package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class WorkingWithDate {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException, ParseException, IOException {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection connection = DriverManager
				.getConnection("jdbc:odbc:student");

		PreparedStatement statement = connection
				.prepareStatement("insert into info(name,city,myDate) values(?,?,?)");

		System.out.println("enter name city and Date(dd-MM-yyyy).");
		Scanner sc = new Scanner(System.in);
		statement.setString(1, sc.nextLine());
		statement.setString(2, sc.nextLine());
		String date = sc.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date d1 = sdf.parse(date);
		long l = d1.getTime();
		Date d2 = new Date(l);
		statement.setDate(3, d2);

		statement.executeUpdate();

		connection.close();
		
		
		
		Connection connection2 = DriverManager
				.getConnection("jdbc:odbc:student");

		Statement statement2 = connection2.createStatement();
		ResultSet rs = statement2.executeQuery("select * from info");
		// to convert String to Date and Date to string
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
		while (rs.next()) {
			Date date1 = rs.getDate(4);
			System.out.println(sdf1.format(date1));

		}

		connection2.close();

	}

}

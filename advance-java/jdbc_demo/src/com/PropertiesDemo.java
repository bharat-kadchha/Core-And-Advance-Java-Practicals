package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {

		Properties propFile = new Properties();
		InputStream fis = new FileInputStream("db.properties");

		propFile.load(fis);

		String className = propFile.getProperty("odbcClassLoad");
		String ur = propFile.getProperty("url");

		Class.forName(className);

		Connection connection = DriverManager.getConnection(ur);

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from info");
		// to convert String to Date and Date to string
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
		while (resultSet.next()) {
			Date date1 = resultSet.getDate(4);
			System.out.println(sdf1.format(date1));

		}

		connection.close();

	}
}

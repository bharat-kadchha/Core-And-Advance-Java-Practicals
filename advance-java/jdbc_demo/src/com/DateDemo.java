package com;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		java.util.Date date = new Date();
		System.out.println("jav.util.Date =" + date);

		java.sql.Date sd = new java.sql.Date(date.getTime());
		Time t = new Time(date.getTime());
		System.out.println("java.sql.Date =" + sd);
		System.out.println("java.sql.Time =" + t);
		// sd.setYear(2000);
		// System.out.println("add :1900+ 2000="+ sd);

		Timestamp ts = new Timestamp(date.getTime());
		System.out.println("java.sql.timestamp =" + ts);

	}
}

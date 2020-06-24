package leb_3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;

public class Java_utilDemo {
	public static void main(String[] args) {

		System.out.println("flo0r " + Math.floor(10.25f));
		System.out.println("flo0r " + Math.ceil(10.25f));
		System.out.println("flo0r " + Math.cos(10));
		System.out.println("flo0r " + Math.sin(45));
		System.out.println("flo0r " + Math.round(40.10));
		System.out.println("flo0r " + Math.random());
		System.out.println("flo0r " + Math.exp(51.2));
		System.out.println("flo0r " + Math.max(10, 25));
		System.out.println("flo0r " + Math.min(10, 25));
		System.out.println("flo0r " + Math.log(2));

		Date date1 = new Date();
		System.out.println(date1);
		Date date2 = new Date(0);
		System.out.println(date2);

		Calendar calender = Calendar.getInstance();
		System.out.println(calender.getFirstDayOfWeek());

		System.out.println(calender.getTime());

		System.out.println(calender.getTimeZone());

		GregorianCalendar gregorianCalendar = new GregorianCalendar();

		System.out.println(gregorianCalendar.isLeapYear(2020));

		System.out.println(gregorianCalendar.getGregorianChange());

		System.out.println(gregorianCalendar.getMinimum(10));

		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextInt());
		}

		Locale l = new Locale("en", "UK");

		System.out.println("locale " + l);
		System.out.println(l.getCountry());
		System.out.println(l.hashCode());
		System.out.println(l.toString());
		System.out.println("language " + l.getDisplayLanguage());
		System.out.println("countty " + l.getDisplayCountry(l));

	}

}

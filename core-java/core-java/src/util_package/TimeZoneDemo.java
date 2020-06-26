package util_package;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneDemo {

	public static void main(String[] args) {

		String[] all = TimeZone.getAvailableIDs();// all ids.

		System.out.println("total IDs==" + all.length);

		// its gives current time for different areas of the world.
		// The different time zones are calculated based on their relation to the
		// coordinated universal time or UTC.

		Date date = new Date();
		DateFormat format = new SimpleDateFormat();

		TimeZone tz = TimeZone.getDefault();
		format.setTimeZone(tz);
		System.out.println(tz.getID());
		System.out.println(tz.toZoneId());
		System.out.println(tz.getDisplayName());

		System.out.println(format.format(date));

		TimeZone tz1 = TimeZone.getTimeZone("Africa/Bujumbura");
		format.setTimeZone(tz1);
		System.out.println(tz1.getDisplayName());
		System.out.println(format.format(date));

	}
}

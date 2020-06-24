package knowledge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDate {

	public static void main(String[] args) {
		Date d = new Date();

		SimpleDateFormat simpDate = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
		System.out.println(simpDate.format(d));

	}

}

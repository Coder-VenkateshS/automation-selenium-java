package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateClassExample {

	public static void main(String[] args) {
		String pattern = "dd-MM-yy";
		SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
		String date = dateformat.format(new Date());
		System.out.println(date);
		
		LocalDate today_date = LocalDate.now();
		System.out.println(today_date);
		System.out.println(today_date.getDayOfMonth());
		System.out.println(today_date.getDayOfWeek());
	}

}

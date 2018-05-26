package basic;

import java.util.Calendar;

public class calendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getWeeksInWeekYear());
		System.out.println(cal.getTimeZone());
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

	}

}

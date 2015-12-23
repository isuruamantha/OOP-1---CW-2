package View;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class MyCalendar {

	public  void Calendar(String nameOftheMonth, String nameOfTheYear) {
		int month;
		int year;

		try {
			month = Integer.parseInt(nameOftheMonth);
			year = Integer.parseInt(nameOfTheYear);
			if (month < 1 || month > 12)
				throw new Exception("Invalid month " + month);
			printCalendarMonthYear(month, year);

		} catch (NumberFormatException e) {
			System.err.println("Number Format Error: " + e.getMessage());
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	private static void printCalendarMonthYear(int month, int year) {
		Calendar cal = new GregorianCalendar();
		cal.clear();
		cal.set(year, month - 1, 1);

		System.out.println("\n"
				+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG,
						Locale.US) + " " + cal.get(Calendar.YEAR));
		int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);
		int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
	}
	
	public void displayEvents(String date) {
		System.out.println("+------------+-------------------------+------------+");
		System.out.println("|    Date    |          Match          |   Status   |");
		System.out.println("+------------+-------------------------+------------+");
		System.out.println("| 22.11.2015 | Barcelona vs Manchester | Not Played |");
		System.out.println("+------------+-------------------------+------------+");
		
	}
	
	private static void printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth) {
		int weekdayIndex = 0;
		System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
		for (int day = 1; day < firstWeekdayOfMonth; day++) {
			System.out.print("    ");
			weekdayIndex++;
		}
		for (int day = 1; day <= numberOfMonthDays; day++) {
			System.out.printf("%1$2d", day);
			weekdayIndex++;
			if (weekdayIndex == 7) {
				weekdayIndex = 0;
				System.out.println();
			} else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
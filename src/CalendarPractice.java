/* Author: Rehna Anthru
 * Sub: Date and Time practice
 * Date: 3/21/2022
 * 
 */

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

public class CalendarPractice {
	
	public static void main(String[] args) {
		
		//getting the current date
		LocalDate currentDate=LocalDate.now();		
		System.out.println("The current Date is: " + currentDate);
		
		//2020-01-01
		LocalDate firstJan2020 = LocalDate.of(2020, Month.JANUARY, 1);
		System.out.println("Date : "+ firstJan2020);
		
		//75th day of 2010(2010-03-06)
		LocalDate seventyFifthDayOf2010 = LocalDate.ofYearDay(2010, 75);
		System.out.println("date : seventyFifthDayOf2010: " + seventyFifthDayOf2010);
		
		//current time
		LocalTime currentTime= LocalTime.now();
		System.out.println("currentTime is : " + currentTime);
		
		//dates with times
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current date and time is: " + currentDateTime);
		
		//2022-12-24 12:00
		LocalDateTime christmas2022 = LocalDateTime.of(2022, Month.DECEMBER, 24, 12, 0);
		System.out.println("date and time of : christmas2022: " + christmas2022);
		
		LocalDate date = LocalDate.of(2022, 2, 15);
		boolean isBefore = LocalDate.now().isBefore(date); 
		
		//getting the month
		Month monthName= date.getMonth();
		System.out.println("dateTimeInformation: month: " + monthName);
		
		int monthValue=monthName.getValue(); //2
		
		int minDays=monthName.minLength();//28
		System.out.println("Minimum days of the month : " + minDays);
		
		int maxDays=monthName.maxLength();//29
		System.out.println("Maximum days of the month : " + maxDays);
		
		//getting the current year
		int year = date.getYear();
		System.out.println("Getting the year: " + year);
		
		int dayOfYear = date.getDayOfYear();
		System.out.println("Day of the year is : " + dayOfYear);
		
		int lengthOfYear = date.lengthOfYear(); // 365
		System.out.println("Length of the year is : " + lengthOfYear);
		
		//checking whether its a leap year
		boolean isLeapYear = date.isLeapYear(); // false
		System.out.println("Is this a leap year? : " + isLeapYear);
		
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int dayOfWeekIntValue = dayOfWeek.getValue(); // 2
		System.out.println("Date is : " + dayOfWeekIntValue);
		String dayOfWeekName = dayOfWeek.name(); // Tuesday
		System.out.println("Day is : " + dayOfWeekName);
		
		int dayOfMonth = date.getDayOfMonth(); // 15
		System.out.println("Day of the month is : " + dayOfMonth);
		
		LocalDateTime startOfDay = date.atStartOfDay();
		System.out.println("Start of the day is : " + startOfDay); //2022-02-15T00:00
		
		// time information
		LocalTime time = LocalTime.of(15, 30); // 15:30:00
		int hour = time.getHour(); // 15
		System.out.println("The hour is : " + hour);
		
		int second = time.getSecond(); // 0
		System.out.println("In seconds is: " + second);	
		
		int minute = time.getMinute(); // 30
		System.out.println("In minutes its is : " + minute);
		
		int secondOfDay = time.toSecondOfDay(); // 55800
		System.out.println("Second of day is : " + secondOfDay);
		
		//Year information
		Year currentYear = Year.now();
		System.out.println("The current year is : " + currentYear);
		
		Year twoThousand = Year.of(2000);
		System.out.println("year: twoThousand: " + twoThousand);
		
		boolean isLeap = currentYear.isLeap();
		System.out.println("year: isLeap: " + isLeap);
		
		int length = currentYear.length(); // 365
		System.out.println("year: length: " + length);
		
		//Duration between two dates 
		LocalDate firstDate = LocalDate.of(2010, 5, 17); // 2010-05-17
		LocalDate secondDate = LocalDate.of(2015, 3, 7); // 2015-03-07
		Period period = Period.between(firstDate, secondDate);

		int days = period.getDays(); // 18
		System.out.println("periodsAndDurations: days: " + days);
		
		int months = period.getMonths(); // 9
		System.out.println("periodsAndDurations: months: " + months);
		
		int years = period.getYears(); // 4
		System.out.println("periodsAndDurations: years: " + years);
	
	}

}
